package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello2
 */
@WebServlet("/Hello2")
public class Hello2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#########");
		System.out.println("Hello2..");
		System.out.println("#########");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello2_Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("###############################<br />");
		out.println("파판Ⅹ하고싶다아아...<br />");
		out.println("###############################<br />");
		out.println("<button onclick=location.href='Hello.jsp'>Hello.jsp</button>");
		out.println("<button onclick=location.href='Hello.html'>Hello.html</button><br/>");
		out.println("<button onclick=location.href='deptList.jsp'>deptList.jsp</button>");
		out.println("<button onclick=location.href='directive.jsp'>directive.jsp</button>");
		out.println("</body>");
		out.println("</html>");
	}

	
}
