package com.wayne.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	// 处理get请求
	// req:用于获取客户端(浏览器)信息
	// res:服务器给客户端(浏览器)返回信息
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//不注释掉下行语句-浏览器报错:HTTP method GET is not supported by this URL
		// super.doGet(req, resp);
		try {
			resp.setContentType("text/html;charset=utf-8");

			PrintWriter pw = resp.getWriter();

			pw.println("<html>");
			pw.println("<body>");
			pw.println("<h1>登录界面</h1>");
			pw.println("<form action=logincl method=post>");
			pw.println("用户名:<input type=text name=username><br>");
			pw.println("密码:<input type=password name=passwd><br>");
			pw.println("<input type=submit value=登录><br>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	// 处理post请求
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);

	}
}
