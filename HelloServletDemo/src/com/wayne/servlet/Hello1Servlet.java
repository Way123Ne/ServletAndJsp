package com.wayne.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello1Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		PrintWriter out = arg1.getWriter();
		//��ȡ�ύ��name��ֵ
		String name = arg0.getParameter("name");
		System.out.println("name>>>>>>>>>>"+name);
		//��ȡ�ύ��contact��ֵ
		String[] contacts = arg0.getParameterValues("contact");
		for (int i = 0; i < contacts.length; i++) {
			System.out.println("contacts>>>>>>>>>>"+contacts[i]);
		}
		out.close();
	}

}
