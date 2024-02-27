package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletBasics
 */
@WebServlet(name="ServletBasics",urlPatterns={"/ServletBasics","/date"})
public class ServletBasics extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 static Date date;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBasics() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()
    {
    	date=new Date();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("Current System Date is= "+date);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
