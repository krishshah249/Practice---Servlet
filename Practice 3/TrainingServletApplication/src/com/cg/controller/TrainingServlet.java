package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Training;
import com.cg.service.TrainingService;
import com.cg.service.TrainingServiceImpl;
import com.cg.util.DBUtil;

/**
 * Servlet implementation class TrainingServlet
 */
@WebServlet("/TrainingServlet")
public class TrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     TrainingService service=new TrainingServiceImpl();
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ArrayList<Training> al=service.getTraining();
		out.println("<tr>");
		out.println("<td>TrainingId</td>");
		out.println("<td>TrainingName</td>");
		out.println("<td>TrainingAvailability</td>");
		out.println("</tr>");
		for(Training t:al)
		{
			out.println();
			out.println(t.getTrainingId());
			out.println(t.getTrainingName());
			out.println(t.getAvailable());
		    out.println("<input type=button name=t.trainingName value=enroll (click)=out.println(you are enrolled)>");
			
		}
		
		out.println("alloted");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
