package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

@WebServlet(name="/DemoServlet",urlPatterns="/DemoServlet",
initParams=@WebInitParam(name="email",value="abc@gmail.com"))

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String mailId;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	ServletConfig config=this.getServletConfig();
    	mailId=config.getInitParameter("email");
    }
    
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		PrintWriter out=response.getWriter();
		ServletContext context= this.getServletContext();
		String manager=context.getInitParameter("Manager");
		out.println("Hello your email is:"+mailId+" Manager = "+manager);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}

