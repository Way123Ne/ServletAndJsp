package com.wayne.loogin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogInCl extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		try {
			// 接收用户名和密码
			String u = req.getParameter("username");
			String p = req.getParameter("passwd");

			// 验证用户名和密码
			if (p.equals("123")) {
				// 合法
				
				//将验证成功的信息，写入session
				HttpSession hs = req.getSession(true);
				//修改session的存在时间
				hs.setMaxInactiveInterval(20);
				hs.setAttribute("pass", "ok");
				
				resp.sendRedirect("loginWel?uname="+u+"&uPass="+p);
			} else {
				// 不合法
				// 写你要跳转到的servlet的那个url
				resp.sendRedirect("logIn");
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
//		super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
