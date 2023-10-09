//===========5. 스타일 다루기 : 아이템 이동하기============================================================
window.addEventListener("load", function() {
    let section = document.querySelector("#s5");
    let btnPrev = section.querySelector(".btn-prev");
    let btnNext = section.querySelector(".btn-next");
    let lis = section.querySelectorAll("li");

    lis[0].onclick = function(e){
        console.log("hello");
        e.target.className = "card-2th"
        lis[1].className = "card-1th"
    }

    lis[2].onclick = function(e){
        e.target.className = "card-2th"
        lis[1].className = "card-3th"
    }


    btnPrev.onclick = function(e){
        e.preventDefault();
        console.log("이전버튼");
    }

    let offIndex = 0;

    btnNext.onclick = function(e){
        e.preventDefault();

        offIndex++;

        let size = lis.length;

        lis[(0+offIndex) % size].className = "card-1th";

        // lis[(0+offIndex) % size].style.left = "0px";
        // lis[(0+offIndex) % size].style.width = "100px"
        // lis[(0+offIndex) % size].style.height = "150px"

        lis[(1+offIndex) % size].className = "card-2th";
        // lis[(1+offIndex) % size].style.left = "calc(50% - 60px)";
        // lis[(1+offIndex) % size].style.width = "120px"
        // lis[(1+offIndex) % size].style.height = "200px"

        lis[(2+offIndex) % size].className = "card-3th";
        // lis[(2+offIndex) % size].style.left = "calc(100% - 100px)";
        // lis[(2+offIndex) % size].style.width = "100px";
        // lis[(2+offIndex) % size].style.height = "150px";


        console.log("다음버튼");
    }

});
//===========4. 스타일 다루기 : 값 입력과 동적으로 박스 스타일 변경============================================================
window.addEventListener("load", function(){
    let section = document.querySelector("#s4");
    let styleInput = section.querySelector(".style-input");
    let widthInput = section.querySelector(".width-input");
    let radiusInput = section.querySelector(".radius-input");
    let colorInput = section.querySelector(".color-input");
    let item = section.querySelector(".item");
    let outputDiv = section.querySelector(".output");

    styleInput.oninput = function(){
        item.style.borderStyle = styleInput.value;
    }

    widthInput.oninput = function(){
        item.style.borderWidth = widthInput.value +"px";
    }

    radiusInput.oninput = function(){
        item.style.borderRadius = radiusInput.value+"px";
    }

})


//===========3. 이벤트 객체 : 개선된 계산기============================================================
window.addEventListener("load", function () {
    let section = document.querySelector("#cal2");
    let input = section.querySelector("input[type=text]");
    let btnInputs = section.querySelectorAll(".num");
    let box = section.querySelector("div");
    let divInput = box.querySelector("input[value='/']");

    divInput.onclick = function (e) {
        e.stopPropagation();
        console.log("나눗셈");
    }

    box.onclick = function (e) {
        e.preventDefault();

        // if(e.target.nodeName == "INPUT"){
        //     input.value += e.target.value;
        // }
        if (e.target.nodeName != "INPUT") {
            return;
        }

        input.value += e.target.value;

    }


})

//===========2. DOM속성 다루기 : 계산기============================================================

window.addEventListener("load", function () {
    let section = document.querySelector("#cal");
    let xInput = section.querySelector(".x-input");
    let yInput = section.querySelector(".y-input");
    let button = section.querySelector(".button");
    let spanResult = section.querySelector("div>span");

    button.onclick = function () {
        let x = parseInt(xInput.value);
        let y = parseInt(yInput.value);

        console.log(x + y);

        spanResult.textContent = "계산결과:" + (x + y);
    }
})

//=======================================================================

window.addEventListener("load", function () {
    // let section = document.getElementById("s1");
    // let input = section.getElementsByClassName("input")[0];
    // let button = section.getElementsByClassName("button")[0];

    let section = document.querySelector("#s1");
    let input = section.querySelector("input[type=text]");
    let button = section.querySelector(".button");

    button.onclick = function () {
        input.value = "안녕하세요";
    };
});


//=======================================================================

// window.addEventListener("load", function () {
//
//     let btnPrint = document.getElementById("btn-print");
//     btnPrint.onclick = printSum;
//
//     function printSum() {
//         var x, y;
//         x = prompt("x :", 0);
//         y = prompt("y :", 0);
//
//         x = parseInt(x);
//         y = parseInt(y);
//
//         console.log(x + y);
//
//         btnPrint.value = x + y;
//     }
// });

