package kr.co.rland.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class IndexController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		int size = 4;
		String size_ = request.getParameter("s");
		if (size_ != null)
			size = Integer.parseInt(size_);

		int type = 1;
		String type_ = request.getParameter("t");
		if (type_ != null)
			type = Integer.parseInt(type_);

		for (int i = 0; i < size; i++)
			out.println("안녕<br>");

		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("Welcome 4 한글");
		if (type == 1) {
			out.write("<hr>");
			out.write("<h2>인삿말을 몇 번 듣고 싶으세요?</h2>");
			out.write("<a href=\"/index?s=1\">1번</a><br>");
			out.write("<a href=\"/index?s=5\">5번</a><br>");
			out.write("<a href=\"/index?s=10\">10번</a><br>");
			out.write("<a href=\"/index?s=100\">100번</a>");
			out.write("<hr>");
		} else if (type == 2) {
			out.write("<h2>인삿말을 몇 번 듣고 싶으세요?</h2>");
			out.write("<form action=\"index\">");
			out.write("	<label>갯수입력</label><input type=\"text\" name=\"s\">");
			out.write("	<input type=\"hidden\" name=\"t\" value=\"2\">");
			out.write("	<input type=\"submit\" value=\"요청\">");
			out.write("</form>");
		}
		out.write("<hr>");
		out.write("<a href=\"/index?t=1\">객관식</a><br>");
		out.write("<a href=\"/index?t=2\">주관식</a><br>");

		out.write("</body>");
		out.write("</html>");

	}
}
