export default class Modal{
    constructor() {
        this.root = this.createRootElement();

        this.host = document.createElement("div");
        document.body.append(this.host);

        const sheet = new CSSStyleSheet();
        sheet.replaceSync(this.getStyleText());

        const shadow = this.host.attachShadow({mode: "open"});
        shadow.adoptedStyleSheets = [sheet];
        shadow.appendChild(this.root);
    }

        // let style = document.createElement("style")
        // document.head.append(style);

        // style.innerText = `
        // .modal{
        //     background-color: #0005;
        //     position: fixed;
        //     left: 0;
        //     top: 0;
        //     width: 100vw;
        //
        //     display: flex;
        //     justify-content: center;
        //     align-items: center;
        //
        //     z-index: 1000;
        //
        //     opacity: 0;
        //     height: 0;
        //     transition: opacity 500ms;
        // }
        //
        // .modal.show{
        //     opacity: 1;
        //     height: 100vh;
        // }
        //
        // .modal.close{
        //     display: none;
        // }
        //
        // .modal
        //     .frame {
        //     background-color: #fff;
        //     border-radius: 10px;
        //
        //     transition: transform 500ms ease-in-out 1s;
        //     }
        //
        // .modal.show
        //     .frame{
        //     }
        //
        // .modal
        //     .frame
        //         .title {
        //             padding: 5px 10px;
        //             background-color: var(--color-main-4);
        //             border-radius: 10px 10px 0 0;
        //             color:var(--color-base-0)
        //         }
        //
        // .modal
        //     .frame
        //         .contents {
        //             padding: 10px 20px;
        //         }
        //
        // .modal
        //     .frame
        //         .command {
        //             padding: 10px 20px;
        //             text-align: center;
        //         }
        //
        // .modal
        //     .frame
        //         .command
        //             button{
        //                 cursor: pointer;
        //             }
        // `

        // this.host.innerHTML = `
        // <section class="modal">
        //     <div class="frame">
        //         <h1 class="title">확인</h1>
        //         <div class="contents">
        //             정말 삭제하시겠습니까!!?
        //         </div>
        //         <div class="command">
        //             <button class="btn btn-main bg-color:main-4 pv:1 font-size:-1 ">확인</button>
        //             <button class="btn btn-base-2 pv:1 font-size:-1">취소</button>
        //         </div>
        //     </div>
        // </section>
        // `
    show() {
        console.log("show");
        this.root.classList.add("show");
    }

    close() {
        console.log("close")

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

        .modal.show
            .frame{
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
                <h1 class="title">asdasd</h1>
                <div class="contents">
                    asdasd
                </div>
                <div class="command">
                    <button class="btn btn-main bg-color:main-4 pv:1 font-size:-1 ">확인</button>
                    <button class="btn btn-base-2 pv:1 font-size:-1">취소</button>
                </div>
            </div>
        `);
        return section;

    }
}
