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

		// ��ȡ������Ϣͷ������
		Enumeration e = arg0.getHeaderNames();
		while (e.hasMoreElements()) {
			// ����Enumeration��ȡÿһ����Ϣͷ������
			String headerName = e.nextElement().toString();
			// �����Ϣͷ����-ֵ�Զ���Ϣ
			System.out.println(headerName + ":" + arg0.getHeader(headerName));

		}
		
		System.out.println("����ʽ:"+arg0.getMethod());
		System.out.println("�����Э������:"+arg0.getProtocol());
		System.out.println("������Դ·��:"+arg0.getRequestURI());
		System.out.println("�����·����Ϣ:"+arg0.getRequestURL());
		System.out.println("�����Servlet·��:"+arg0.getServletPath());
	}

}
