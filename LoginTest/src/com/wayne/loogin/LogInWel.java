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
		
		//���Session
		HttpSession hs =req.getSession(true);
		String val = (String) hs.getAttribute("pass");
		
		//�ж�
		if(val==null){
			//�Ƿ���¼
			resp.sendRedirect("login");
		}
		
		//�õ���loginCl���ݵ��û���&����
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
