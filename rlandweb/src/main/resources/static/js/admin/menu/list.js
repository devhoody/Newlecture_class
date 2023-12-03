import Modal from '/js/lib/modal.js';

let menuList = document.querySelector(".menu-list");
let fileInput = menuList.querySelector("input[type=file]");
let preview = menuList.querySelector(".menu-reg img");
let csrfToken = document.querySelector("#csrf").content;
console.log(csrfToken);
let userId = document.querySelector("#userid").content;
console.log(userId);

// 이미지 등록
fileInput.oninput =function(e){

    console.log("파일입력");
    const files = e.target.files;
    let text = "";

    for(const file of files){
        text += `${file.name}: ${file.type || '알수없음'}\n`;
    }

    let img = files[0];

    // 입력한 파일 타입제한 ( 이미지만 받기 )
    // if(img.type.indexOf("image/") != 0){
    //     let modal = new Modal({
    //         title : "제목입니다~",
    //         content : "이미지만 삽입할 수 있습니다.",
    //         onok: function(){
    //
    //         }
    //     });
    //     modal.show();
    //     return;
    // }

    // 이미지 출력하기( 파일 읽기)
    let reader = new FileReader();

    reader.readAsDataURL(img);

    reader.addEventListener(
        "load",
        () => {
            let img = fileInput.nextElementSibling
            img.src = reader.result;
            // preview.src = reader.result;
        },
        false,
    );

    console.log(text);
}


// modal 출력
menuList.onclick = function(e) {

    let el = e.target;
    // 클래스 클릭시만 유효하도록 지정
    let isValidButtonClicked = el.classList.contains("btn-menu-del")
        || el.classList.contains("btn-menu-reg")
        || el.classList.contains("btn-menu-add")
        || false;

    if(!isValidButtonClicked){
        return;
    }

    // 삭제 버튼
    if(el.classList.contains("btn-menu-del")){
        e.preventDefault();
        let modal = new Modal({
            title : "제목입니다~",
            content : "정말 삭제하시게요?",
            onok: function(){
                console.log("삭제되었습니다!");
            }

        });

        // 얘가 먼저 실행됨
        modal.onok = function(){
            console.log("선택한 메뉴가 정상적으로 삭제되었습니다.");
        }
        //modal.title = "제목입니다";
        //moda.setTitle("제목입니다~");
        modal.show();
    } else if(el.classList.contains("btn-menu-add")){ // 추가
        el.parentElement.classList.add("slide-out");
    } else if(el.classList.contains("btn-menu-reg")) { // 메뉴등록 버튼
        e.preventDefault();

        let ajaxIcon = menuList.querySelector(".ajax-icon");
        ajaxIcon.classList.remove("d:none");

        let form = document.querySelector(".menu-reg form");

        let korName = form.querySelector("input[name=kor-name]").value;
        let engName = form.querySelector("input[name=eng-name]").value;
        let price = form.querySelector("input[name=price]").value;

        console.log(korName, engName, price);

        let files = fileInput.files;

        let formData = new FormData();
        formData.append("korName", korName);
        formData.append("engName", engName);
        formData.append("price", price);
        formData.append("memberId", userId);

        for(let img of files){
            formData.append("imgFiles", img);
        }

        let request = new XMLHttpRequest();
        request.upload.onprogress = (e)=>{
            if(!e.lengthComputable)
                return;

            let x = (100 * e.loaded) / e.total;
            console.log(x + "%");
        }

        request.open("POST", "/api/menus");
        request.setRequestHeader("X-CSRF-TOKEN", csrfToken);
        request.onload = () => {
            let menuReg = menuList.querySelector(".menu-reg");
            let newOne = JSON.parse(request.responseText);
            console.log("가져온 메뉴 ::: "+ newOne);

            let template = `
                <section class="menu" style="opacity: 0;transition: 1s;">
                    <h1>
                        <a class="heading-3" href="detail.html">${newOne.korName}</a>
                    </h1>
                    <h2 class="heading-2 font-weight:normal color:base-5">${newOne.engName}</h2>
                    <div class="price-block d:flex align-items:flex-end"><span
                    class="font-weight:bold">${newOne.price}</span>원<span
                    class="soldout-msg ml:auto mr:auto md:d:none">SOLD OUT</span></div>
                    <div class="img-block">
                    <a href="detail.html?id=1"><img src="/image/menu/${newOne.img}"></a>
                    </div>
                    <div class="pay-block d:flex">
                    <a class="icon icon-pancel icon-color:base-1 color:base-0
                            md:icon:none md:btn-color:main-3 btn-type:icon md:btn-type:text"
                       href="">수정</a>
                    <a class="btn-menu-del icon icon-trash icon-color:base-1 color:base-0
                                                                md:icon:none md:btn-color:accent-1 btn-type:icon md:btn-type:text"
                       href="">삭제</a>
                    </div>
                </section>
            `;
            menuReg.insertAdjacentHTML("afterend", template);

            setTimeout(()=>{
                menuReg.nextElementSibling.style.opacity=1;
                ajaxIcon.classList.add("d:none");
            },10);

        }
        request.send(formData);
    }
};





