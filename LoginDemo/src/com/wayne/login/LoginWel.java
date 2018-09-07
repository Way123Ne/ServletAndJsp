package com.wayne.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginWel extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//²»×¢ÊÍµôÏÂÐÐÓï¾ä-ä¯ÀÀÆ÷±¨´í:HTTP method GET is not supported by this URL
		// super.doGet(req, resp);

		try {
			PrintWriter pw = resp.getWriter();
			pw.println("wel,hello");
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
