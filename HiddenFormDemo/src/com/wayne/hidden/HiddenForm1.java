package com.wayne.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenForm1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		try {
			resp.setContentType("text/html;charset=utf-8");

			PrintWriter pw = resp.getWriter();

			pw.println("<html>");
			pw.println("<body>");
			pw.println("<h1>登录界面</h1>");
			pw.println("<form action=hidform2 method=post>");
			pw.println("用户名:<input type=text name=username><br>");
			pw.println("密码:<input type=password name=passwd><br>");
			pw.println("<input type=hidden name=sex value=man><br>");
			pw.println("<input type=submit value=登录><br>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
