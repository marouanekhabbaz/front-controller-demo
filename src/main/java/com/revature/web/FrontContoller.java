package com.revature.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontContoller
 */
public class FrontContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/*
	 * this metjod will be resposible to determining what ressource the client is requesting
	 * 
	 * it will the url and only capture the end part which would be loging in *(http//local:8000/F..........)
	 * 
	 * for example. 
	 * 
	 * once it captue the distination it calls a requestHelper whih will suply the right functionallioty
	 * 
	 * 
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		final String URI = request.getRequestURI().replace("/FrontContollerDemo", "");
		
		
		switch(URI) {
		case "login":
			RequestHelper.processLogin(request, response);
			break;
		case "error":
			RequestHelper.processError(request, response);
			break;
		default:
			break;
		
		
		}
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// If a client sends a post request here, it invokes doGet() instead
		
		
		doGet(request, response);
	}

}
