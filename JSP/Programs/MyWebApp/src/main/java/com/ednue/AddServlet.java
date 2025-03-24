package com.ednue;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int first = Integer.parseInt(req.getParameter("num1"));
		int second = Integer.parseInt(req.getParameter("num2"));
		int sum = first + second;
		
		PrintWriter out = resp.getWriter();
		
		out.println("The sum is : " + sum);
		
	}

}
