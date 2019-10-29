package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
    super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String s1=request.getParameter("cid");
	String s2=request.getParameter("name");
	String s3=request.getParameter("city");
	String s4=request.getParameter("password");
	String s5=request.getParameter("gender");
	String s6=request.getParameter("email");
	
	
	}
}
