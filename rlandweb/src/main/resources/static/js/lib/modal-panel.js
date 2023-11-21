export default class HTMLModalPanelElement extends HTMLElement{

    #title;
    #content;
    #onok;
    constructor() {
        super();
        //속성들
        this.#title = "확인";
        this.#content = "삭제하시겠습니까?";
        // this.#onok = args.onok;
        console.log(this.dir);

        // CSS 한번에 떄려넣기 : style.cssText
        // this.style.cssText = `position: absolute;
        //                       left: 0px;
        //                       top: 0px;
        //                       width: 100%;
        //                       height: 100%;
        //                       background-color:black;
        //                       z-index: 3000`

        const sheet = new CSSStyleSheet();
        sheet.replaceSync(this.getStyleText());
        this.root = this.createRootElement();
        const shadow = this.attachShadow({mode:"open"});
        shadow.adoptedStyleSheets = [sheet];
        shadow.appendChild(this.root);

        // 취소버튼
        // const cancelButton = this.root.querySelector(".btn-cancel");
        // cancelButton.onclick = this.btnCancelHandler.bind(this);

        // // 확인버튼
        // const OkButton = this.root.querySelector(".btn-ok");
        // OkButton.onclick = this.btnOkHandler.bind(this);

    }

    // 취소버튼 눌렀을때 작동함수
    btnCancelHandler(){
        this.close();
    }


    // 확인버튼 눌렀을때 작동함수
    btnOkHandler(){
        if(this.#onok)
            this.#onok();

        this.close();
    }

    // list에서 수정한 속성값 setter들
    set title(title){
        this.#title = title;

        // root문서와의 title 연결
        // this.root.querySelector(".title").innerText = this.#title;
    }

    set content(content){
        this.#content = content

        // root문서와의 title 연결
        // this.root.querySelector(".content").innerText = this.#content;
    }

    set onok(CallBack){
        this.#onok = CallBack;
    }

    show() {
        console.log("show");


        // setTimeout(()=>{
        //     this.root.classList.add("show");
        // }, 20);
    }

    close() {
        // this.root.classList.remove("show");
        // this.root.classList.add("close");
    }

    getStyleText(){
        return `
        .modal{
            background-color: #0005;
            position: fixed;
            left: 0;
            top: 0;
            width: 100vw;

            display: flex;
            justify-content: center;
            align-items: center;

            z-index: 1000;

            opacity: 0;
            height: 0;
            transition: opacity 500ms;
        }

        .modal.show{
            opacity: 1;
            height: 100vh;
        }

        .modal.close{
            display: none;
        }

        .modal
            .frame {
            background-color: #fff;
            border-radius: 10px;
            padding : 10px 30px;
            transition: transform 500ms ease-in-out 1s;
            width : 200px;
            height : 200px;
            }

        .modal
            .frame
                .title {
                    padding: 5px 10px;
                    background-color: var(--color-main-4);
                    border-radius: 10px 10px 0 0;
                    color:var(--color-base-0);
                }

        .modal
            .frame
                .contents {
                    padding: 10px 20px;
                }

        .modal
            .frame
                .command {
                    padding: 10px 20px;
                    text-align: center;
                }

        .modal
            .frame
                .command
                    button{
                        cursor: pointer;
                    }
        `;
    }

    createRootElement(){
        let section = document.createElement("section");
        section.classList.add("modal");
        section.insertAdjacentHTML("beforeend",`
            <div class="frame">
                <h1 class="title">${this.#title}</h1>
                <div class="contents">
                    <slot name="modal-content"></slot> <!-- slot 추가 -->
                </div>
                <div class="command">
                    <button class="btn-ok btn btn-main bg-color:main-4 pv:1 font-size:-1 ">확인</button>
                    <button class="btn-cancel btn btn-base-2 pv:1 font-size:-1">취소</button>
                </div>
            </div>
        `);
        return section;
    }

}

customElements.define("modal-panell", HTMLModalPanelElement);