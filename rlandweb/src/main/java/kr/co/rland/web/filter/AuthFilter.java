package kr.co.rland.web.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;

import java.io.IOException;

//@Component
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터거르기");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        Object username_ = session.getAttribute("username");

        // 내가 있던 곳 이동
        if(username_ == null)
            request.getRequestDispatcher("/user/login?returnURL=/menu/list")
                    .forward(request,response);

        chain.doFilter(request,response);
    }
    }
