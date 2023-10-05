window.addEventListener("load", function(){
    // let btnSubmit = document.querySelector(".form-section .btn-find");
    let findButton = document.querySelector(".form-section .btn-find");
    let inputQuery = document.querySelector(".form-section .input-query");
    findButton.onclick = function(e){
        e.preventDefault();

        let query = inputQuery.value;
        console.log(query);
    }


});



