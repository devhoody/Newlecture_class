window.addEventListener("load", function () {
    // let btnSubmit = document.querySelector(".form-section .btn-find");
    let findButton = document.querySelector(".query-filter .btn-find");
    let inputQuery = document.querySelector(".query-filter .input-query");
    let categoryFilterSection = document.querySelector(".category-filter");
    let categoryUl = categoryFilterSection.querySelector("ul");
    let currentCategory = categoryUl.querySelector("li:first-child a");

    let content = document.querySelector(".menu-card-list .content");

    function bind(text){
        let list = JSON.parse(text);
        // alert(request.responseText);

        content.innerHTML = "";
        // section을 위한 DOM 객체를 직접 생성해서 append 한다.
        for (let m of list) {
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
    categoryUl.onclick = function(e){
        e.preventDefault();

        let el = e.target;

        if(el.tagName !== "A"){
            return;
        }

        // 카테고리 클릭시 흰색 바꾸기
        currentCategory.classList.remove("current");
        el.classList.add("current");
        currentCategory = el;

        console.log(el.href);
        console.log(el.dataset.id);

        console.log("클릭했씀.");

        // 카테고리 id 전달
        let request = new XMLHttpRequest();
        request.open("GET", `/api/menus?c=${el.dataset.id}`, true);
        request.onload = function(){
            bind(request.responseText);
        }
        request.send();
    }

    findButton.onclick = function (e) {
        e.preventDefault();

        let query = inputQuery.value;

        let request = new XMLHttpRequest();
        request.open("GET", `/api/menus?q=${query}`, true); // true : 비동기
        request.onload = function () {
            let list = JSON.parse(request.responseText);
            // alert(request.responseText);

            content.innerHTML = "";
            // section을 위한 DOM 객체를 직접 생성해서 append 한다.
            for (let m of list) {
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
        };
        request.send();
    };

    });



