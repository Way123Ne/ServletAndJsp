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
		//当用户访问该servlet时，就将信息创建到该用户的cookie中
		//1.首先在服务器端创建一个cookie
		Cookie myCookie = new Cookie("color1","red");
		//2.该cookie存在的时间-如果不设置存在时间，那么该cookie将不会保存
		myCookie.setMaxAge(20);
		//3.将该cookie写到客户端
		resp.addCookie(myCookie);
		
		pw.println("已经创建了cookie");
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
