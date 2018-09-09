package com.wayne.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		// 中文乱码
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter pw = resp.getWriter();

		HttpSession hs = req.getSession(true);

		// 向SessionTest3中添加一个属性(String类型)
		hs.setAttribute("you", "25");
		hs.setAttribute("he", "32");

		// 在没有删除SessionTest3中的you属性
		pw.println("在没有删除you前you属性的值=" + hs.getAttribute("you") + "<br>");

		// 注意:session有效期设置为0，后面语句均无法执行
		// 且报错:Session already invalidated?
		// hs.setMaxInactiveInterval(0);

		// 从SessionTest3中删除you属性
		hs.removeAttribute("you");
		pw.println("删除you后you属性的值=" + hs.getAttribute("you") + "<br>");

		pw.println("删除you后he属性的值=" + hs.getAttribute("he") + "<br>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}

}
