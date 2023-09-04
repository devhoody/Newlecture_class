package kr.co.rland.app.controller;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class List extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // OutputStream os = response.getOutputStream();
        PrintWriter out = response.getWriter();

        out.println("hello servlet");
        out.println("안녕 서블릿");
    }
}