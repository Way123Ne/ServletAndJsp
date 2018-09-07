package com.wayne.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//不注释掉下行语句-浏览器报错:HTTP method GET is not supported by this URL
		// super.doGet(req, resp);

		try {
			// 接收用户名和密码
			String u = req.getParameter("username");
			String p = req.getParameter("passwd");

			// 验证用户名和密码
			if (u.equals("sp") && p.equals("123")) {
				// 合法
				resp.sendRedirect("loginwel");
			} else {
				// 不合法
				// 写你要跳转到的servlet的那个url
				resp.sendRedirect("login");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);

	}
}
