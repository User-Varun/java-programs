package com.univ.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SesDemo
 */
@WebServlet("/SesDemo")
public class SesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession(true); // creating a new session
		PrintWriter pw = response.getWriter();
		Integer i = (Integer)(hs.getAttribute("key"));
		if(i == null) {
			pw.println("You are visiting 1 time");
			hs.setAttribute("key", 1); // put value in session
		}else {
			int x = i;
			
			x = x+1;
			pw.println("you are visiting "+x+" Time");
			hs.setAttribute("key", x);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
