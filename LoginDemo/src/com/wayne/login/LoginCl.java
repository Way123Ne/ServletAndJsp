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
		//��ע�͵��������-���������:HTTP method GET is not supported by this URL
		// super.doGet(req, resp);

		try {
			// �����û���������
			String u = req.getParameter("username");
			String p = req.getParameter("passwd");

			// ��֤�û���������
			if (u.equals("sp") && p.equals("123")) {
				// �Ϸ�
				resp.sendRedirect("loginwel");
			} else {
				// ���Ϸ�
				// д��Ҫ��ת����servlet���Ǹ�url
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
