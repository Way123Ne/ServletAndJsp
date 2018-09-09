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

		// ��������
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter pw = resp.getWriter();

		HttpSession hs = req.getSession(true);
		// �õ�session��id�����������������
		String sessionId = hs.getId();

		pw.println("SessionTest2��Session id=" + sessionId + "<br>");

		// �õ�SessionTest1�е�name=wangwu��һ����
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
