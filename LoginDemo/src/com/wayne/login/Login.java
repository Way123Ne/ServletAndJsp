package com.wayne.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	// ����get����
	// req:���ڻ�ȡ�ͻ���(�����)��Ϣ
	// res:���������ͻ���(�����)������Ϣ
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��ע�͵��������-���������:HTTP method GET is not supported by this URL
		// super.doGet(req, resp);
		try {
			resp.setContentType("text/html;charset=utf-8");

			PrintWriter pw = resp.getWriter();

			pw.println("<html>");
			pw.println("<body>");
			pw.println("<h1>��¼����</h1>");
			pw.println("<form action=logincl method=post>");
			pw.println("�û���:<input type=text name=username><br>");
			pw.println("����:<input type=password name=passwd><br>");
			pw.println("<input type=submit value=��¼><br>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	// ����post����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);

	}
}
