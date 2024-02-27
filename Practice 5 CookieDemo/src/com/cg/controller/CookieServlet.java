package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int id=1000;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String qstr=request.getParameter("action");
		if("index".equals(qstr)){
			Cookie cookie = new Cookie("sessionId"," "+(id++));
			Cookie cookie1 = new Cookie("name",""+request.getQueryString());
			response.addCookie(cookie);
			response.addCookie(cookie1);
			RequestDispatcher d= request.getRequestDispatcher("success.html");
			d.forward(request, response);
		}
		else if("success".equals(qstr)){
			PrintWriter o=response.getWriter();
			Cookie [] cookie=request.getCookies();
			for(Cookie obj:cookie){
				o.print("name="+obj.getName());
				o.print("max age="+obj.getMaxAge());
				o.print("value="+obj.getValue());
			}
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
