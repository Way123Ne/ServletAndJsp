package com.wayne.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		try{
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		//���û����ʸ�servletʱ���ͽ���Ϣ���������û���cookie��
		//1.�����ڷ������˴���һ��cookie
		Cookie myCookie = new Cookie("color1","red");
		//2.��cookie���ڵ�ʱ��-��������ô���ʱ�䣬��ô��cookie�����ᱣ��
		myCookie.setMaxAge(20);
		//3.����cookieд���ͻ���
		resp.addCookie(myCookie);
		
		pw.println("�Ѿ�������cookie");
		}catch(Exception e){
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
