package com.wayne.loogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogInWel extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		//获得Session
		HttpSession hs =req.getSession(true);
		String val = (String) hs.getAttribute("pass");
		
		//判断
		if(val==null){
			//非法登录
			resp.sendRedirect("login");
		}
		
		//得到从loginCl传递的用户名&密码
		String u = req.getParameter("uname");
		String p = req.getParameter("uPass");
		
		try {
			PrintWriter pw = resp.getWriter();
			pw.println("wel,hello:" + u + "pass = " + p);
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
