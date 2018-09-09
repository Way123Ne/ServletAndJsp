package com.wayne.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		// 中文乱码
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter pw = resp.getWriter();

		HttpSession hs = req.getSession(true);
		// 得到session的id，这是由容器分配的
		String sessionId = hs.getId();

		pw.println("SessionTest2的Session id=" + sessionId + "<br>");

		// 得到SessionTest1中的name=wangwu这一属性
		String mName = (String) hs.getAttribute("name");
		pw.println("name=" + mName);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
