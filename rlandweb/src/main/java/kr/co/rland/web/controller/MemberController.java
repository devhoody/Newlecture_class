package kr.co.rland.web.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberController {

    @GetMapping("index")
    public String index(HttpSession session){
        Object username_ = session.getAttribute("username");

        // 내가 있던 곳 이동
        if(username_ == null)
            return "redirect:../user/login?returnURL=/member/index";

        // 홈페이지 이동
        return "member/index";
    }
}
