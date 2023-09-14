package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("list")
    public String list() {
        return "/WEB-INF/view/menu/list.jsp";
    }

    @RequestMapping("detail")
    public String detail() {
        return "/WEB-INF/view/menu/detail.jsp";
    }

}
