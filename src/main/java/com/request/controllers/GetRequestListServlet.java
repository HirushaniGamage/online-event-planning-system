 package com.request.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.request.model.Request;
import com.request.util.RequestDbUtil;

/**
 * Servlet implementation class GetRequestListServlet
 */
@WebServlet("/GetRequestListServlet")
public class GetRequestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetRequestListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("requestId");
		
		
  
		doGet(request, response);
		
		boolean isTrue = false;
		
		if (isTrue == true)
		{
		List<Request> requests = RequestDbUtil.getRequestList(id);
		request.setAttribute("Request", requests);
		
			RequestDispatcher dis = request.getRequestDispatcher("RequestList.jsp");
			 dis.forward(request, response);
		 }
		 else {
			 
			 RequestDispatcher dis = request.getRequestDispatcher("UpdateRequest.jsp");  
			 dis.forward(request, response);
		 }
	
	}

}
