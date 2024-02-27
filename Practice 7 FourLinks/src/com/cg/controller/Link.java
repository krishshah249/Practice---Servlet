package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Link
 */
@WebServlet("/Link")
public class Link extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Link() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String req= request.getParameter("action");
		RequestDispatcher rd;
		if(req.equals("A")){
			
			rd = request.getRequestDispatcher("A.html");
			System.out.println("nikal");
			rd.forward(request, response);
			
		}
		if(req.equals("S")){
			
			rd = request.getRequestDispatcher("S.html");
			rd.forward(request, response);
			
		}
		if(req.equals("M")){
			
			rd = request.getRequestDispatcher("M.html");
			rd.forward(request, response);
	
		}
		if(req.equals("D")){
			
			rd = request.getRequestDispatcher("D.html");
			rd.forward(request, response);
	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str= request.getParameter("action");
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		PrintWriter out = response.getWriter();
		if(str.equals("add")){
			
			out.println("The Addition of "+a+" + "+b+" = "+(a+b));
			
		}
		if(str.equals("sub")){

			out.println("The Subtraction of "+a+" - "+b+" = "+(a-b));
		}
		if(str.equals("mul")){
	
			out.println("The Multiplication of "+a+" * "+b+" = "+(a*b));
		}
		if(str.equals("div")){
	
			out.println("The Division of "+a+" / "+b+" = "+(a/b));
		}
		
		
		
	}

}