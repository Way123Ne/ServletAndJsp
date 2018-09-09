package com.wayne.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest1 extends HttpServlet {

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

		pw.println("SessionTest1的Session id=" + sessionId + "<br>");

		// 向Session中添加一个属性(String类型)
		hs.setAttribute("name", "wangwu");
		// 如果不指定时间，那么该session的默认有效期是30m
		// 也可以自己修改指定该时间-30s(持续保持时间，最好办法：自己打开浏览器自己测试：30秒内不刷新&刷新的区别)
		hs.setMaxInactiveInterval(30);
		pw.println("在SessionTest1中放入一个属性name=wangwu");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
