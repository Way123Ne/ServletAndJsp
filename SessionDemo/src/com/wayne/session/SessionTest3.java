package com.wayne.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		// ��������
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter pw = resp.getWriter();

		HttpSession hs = req.getSession(true);

		// ��SessionTest3�����һ������(String����)
		hs.setAttribute("you", "25");
		hs.setAttribute("he", "32");

		// ��û��ɾ��SessionTest3�е�you����
		pw.println("��û��ɾ��youǰyou���Ե�ֵ=" + hs.getAttribute("you") + "<br>");

		// ע��:session��Ч������Ϊ0�����������޷�ִ��
		// �ұ���:Session already invalidated?
		// hs.setMaxInactiveInterval(0);

		// ��SessionTest3��ɾ��you����
		hs.removeAttribute("you");
		pw.println("ɾ��you��you���Ե�ֵ=" + hs.getAttribute("you") + "<br>");

		pw.println("ɾ��you��he���Ե�ֵ=" + hs.getAttribute("he") + "<br>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
