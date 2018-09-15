package com.wayne.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		try {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();

			// �ӿͻ��˵õ�����cookie��Ϣ
			Cookie[] allCookies = req.getCookies();

			int i = 0;
			// ���allCookies��Ϊ��
			if (allCookies != null) {
				
				// ����ȡ��cookie
				for (int j = 0; j < allCookies.length; j++) {
					// ����ȡ��
					Cookie temp = allCookies[j];

					if (temp.getName().equals("color1")) {
						// �õ�cookie��ֵ
						String val = temp.getValue();
						pw.println("color1=" + val);
//						break;
					}
				}
				
				if (allCookies.length == i) {
					pw.println("cookie����");
				}
				
			} else {
				pw.println("������color1���cookie/���ǹ�����");
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
