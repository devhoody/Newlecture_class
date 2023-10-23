window.addEventListener("load", function () {
    // let btnSubmit = document.querySelector(".form-section .btn-find");
    let findButton = document.querySelector(".query-filter .btn-find");
    let inputQuery = document.querySelector(".query-filter .input-query");

    let categoryFilterSection = document.querySelector(".category-filter");
    let categoryUl = categoryFilterSection.querySelector("ul");
    let currentCategory = categoryUl.querySelector("li:first-child a");
    // let hearts = document.querySelectorAll(".menu-card-list .btn-like");
    //
    //
    //
    // for(let i=0; i<hearts.length; i++){
    //     hearts[i].onclick = function(e){
    //         e.preventDefault();
    //         console.log("hello");
    //     }
    // }

    let content = document.querySelector(".menu-card-list .content");

    content.onclick = (e)=>{
        e.preventDefault();

        let el = e.target;
        if(!el.classList.contains("btn-like"))
            return;

        console.log("hello");

        let response = fetch(`/api/likes/3`);
        response.then(function(){
            console.log(response.json());
        })
    }

    function bind(json){
        // let list = JSON.parse(text);
        // alert(request.responseText);

        content.innerHTML = "";
        // section을 위한 DOM 객체를 직접 생성해서 append 한다.
        for (let m of json) {
            let iconHeart = m.isLike ? "icon-heart-fill" : "icon-heart";

            let template = `
                <section class="menu-card">
                    <h1>
                        <a class="heading-3" href="detail.html">${m.korName}</a></h1>
                    <h2 class="heading-2 font-weight:normal color:base-5">${m.engName}</h2>
                    <div class="price-block d:flex align-items:flex-end">
                        <span class="font-weight:bold" >${m.price}</span>원<span class="soldout-msg ml:auto mr:auto md:d:none">SOLD OUT</span></div>
                    <div class="img-block">
                        <a href="detail?id=${m.id}"><img src="/image/menu/product/${m.img}"></a>
                    </div>
                    <div class="like-block d:flex justify-content:flex-end">
                        <a  class="icon icon-color:base-4 ${iconHeart}" href="">좋아요</a>
                        <span class="font-weight:bold ml:1">${m.likeCount}</span>
                    </div>
                    <div class="pay-block d:flex">
                        <a class="icon md:icon:none icon-cart icon-color:base-0 color:base-0 btn-type:icon btn-cart md:btn-type:text" href="">담기</a>
                        <a class="icon md:icon:none icon-card icon-color:base-0 color:base-0 btn-type:icon btn-card md:btn-type:text" href="">주문하기</a>
                    </div>
                </section>
                `;
            content.insertAdjacentHTML("beforeend", template); // 때려부수지 않고 새로 짓는거
            // content.innerHTML = content.innerHTML + template; // 때려부수고 새로 짓는거
        }
    }

    categoryUl.onclick = async function(e){
        e.preventDefault();

        let el = e.target;

        if(el.tagName !== "A"){
            return;
        }

        // 카테고리 클릭시 흰색 바꾸기
        currentCategory.classList.remove("current");
        el.classList.add("current");
        currentCategory = el;

        console.log(el.dataset.id);

        // 카테고리 id 전달
        let response = await fetch(`/api/menus?c=${el.dataset.id}`);
        let list = await response.json();
        bind(list);

        // let request = new XMLHttpRequest();
        // request.open("GET", `/api/menus?c=${el.dataset.id}`, true);
        // request.onload = function(){
        //     bind(request.responseText);
        // }
        // request.send();
    }

    findButton.onclick = async function (e) {
        e.preventDefault();

        let query = inputQuery.value;

        let response = await fetch(`/api/menus?q=${query}`);
        let list = await response.json();
        bind(list);

        // let request = new XMLHttpRequest();
        // request.open("GET", `/api/menus?q=${query}`, true); // true : 비동기
        // request.onload = function () {
        //     bind(request.responseText);
        // };
        // request.send();
    };

});



