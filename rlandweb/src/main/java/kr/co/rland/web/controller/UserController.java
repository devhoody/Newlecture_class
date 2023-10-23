package kr.co.rland.web.controller;

import jakarta.servlet.http.HttpSession;
import kr.co.rland.web.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private MemberService service;

    @GetMapping("login")
    public String login(){

        return "user/login";
    }

//    @PostMapping("login")
//    public String login(
//            String username,
//            String password,
//            @RequestParam("return-url") String returnURL,
//            HttpSession session) {
//
//        // 로그인 유효성 검사
//        if(service.isValid(username, password)){
//            session.setAttribute("username", username);
//
//            // 리턴 페이지 위치 설정
//            if(returnURL != null && returnURL !="")
//                return "redirect:"+returnURL; // 내가 왔던 곳으로 이동
//            // session에 username 가져옴 !
//            return "redirect:/index"; // 기존 홈페이지로 이동
//        }
//
//        System.out.println(service.isValid(username, password));
//        return "redirect:/user/login?error"; // 유효성 검사 실패시 이동
//
//    }
}
