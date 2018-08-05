package com.wayne.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqInfoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);

		// 获取所有消息头的名称
		Enumeration e = arg0.getHeaderNames();
		while (e.hasMoreElements()) {
			// 遍历Enumeration获取每一个消息头的名称
			String headerName = e.nextElement().toString();
			// 输出消息头的名-值对儿信息
			System.out.println(headerName + ":" + arg0.getHeader(headerName));

		}
		
		System.out.println("请求方式:"+arg0.getMethod());
		System.out.println("请求的协议种类:"+arg0.getProtocol());
		System.out.println("请求资源路径:"+arg0.getRequestURI());
		System.out.println("请求的路径信息:"+arg0.getRequestURL());
		System.out.println("请求的Servlet路径:"+arg0.getServletPath());
	}

}
