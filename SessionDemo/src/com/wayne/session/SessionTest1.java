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
		// ��������
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter pw = resp.getWriter();

		HttpSession hs = req.getSession(true);
		// �õ�session��id�����������������
		String sessionId = hs.getId();

		pw.println("SessionTest1��Session id=" + sessionId + "<br>");

		// ��Session�����һ������(String����)
		hs.setAttribute("name", "wangwu");
		// �����ָ��ʱ�䣬��ô��session��Ĭ����Ч����30m
		// Ҳ�����Լ��޸�ָ����ʱ��-30s(��������ʱ�䣬��ð취���Լ���������Լ����ԣ�30���ڲ�ˢ��&ˢ�µ�����)
		hs.setMaxInactiveInterval(30);
		pw.println("��SessionTest1�з���һ������name=wangwu");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
