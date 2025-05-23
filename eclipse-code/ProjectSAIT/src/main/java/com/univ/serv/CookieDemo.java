package com.univ.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CookieDemo
 */
@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie ck[] = request.getCookies();
		
		if(ck == null) {
			
			Cookie c1 = new Cookie("amit" , "12345");
			c1.setMaxAge(60*60*24*5);
			response.addCookie(c1);
			response.sendRedirect("login.html");
		}else {
			String nm = ck[0].getName();
			String val = ck[0].getValue();
			
			if(nm.equals("amit") && val.equals("12345")) {
				response.sendRedirect("index.html");
				
			}else {
				response.sendRedirect("login.html");
			}
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
