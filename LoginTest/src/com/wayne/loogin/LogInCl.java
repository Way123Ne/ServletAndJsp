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
			// �����û���������
			String u = req.getParameter("username");
			String p = req.getParameter("passwd");

			// ��֤�û���������
			if (p.equals("123")) {
				// �Ϸ�
				
				//����֤�ɹ�����Ϣ��д��session
				HttpSession hs = req.getSession(true);
				//�޸�session�Ĵ���ʱ��
				hs.setMaxInactiveInterval(20);
				hs.setAttribute("pass", "ok");
				
				resp.sendRedirect("loginWel?uname="+u+"&uPass="+p);
			} else {
				// ���Ϸ�
				// д��Ҫ��ת����servlet���Ǹ�url
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
