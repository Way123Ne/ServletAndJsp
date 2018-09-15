package com.wayne.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		try {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();

			// 从客户端得到所有cookie信息
			Cookie[] allCookies = req.getCookies();

			int i = 0;
			// 如果allCookies不为空
			if (allCookies != null) {

				// 从中取出cookie
				for (int j = 0; j < allCookies.length; j++) {
					// 依次取出
					Cookie temp = allCookies[j];

					if (temp.getName().equals("color1")) {
						// 将该cookie删除
						temp.setMaxAge(0);
						pw.println("删除了color1这个cookie");
						break;
					}
				}
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
