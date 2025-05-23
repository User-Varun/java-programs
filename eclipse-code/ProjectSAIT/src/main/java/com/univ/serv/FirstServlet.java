package com.univ.serv;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.univ.DAO.CustomerDAO;
import com.univ.DTO.CustomerDTO;
//import java.io.PrintWriter;


/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("cnm");
		String add = request.getParameter("cadd");
		String email = request.getParameter("email");
		String mob = request.getParameter("mob");
		String unm = request.getParameter("unm");
		String pw = request.getParameter("pw");
		CustomerDTO dto = new CustomerDTO();
		dto.setCname(name);
		dto.setCadd(add);
		dto.setEmail(email);
		dto.setMob(Long.parseLong(mob));
		dto.setUnm(unm);
		dto.setPw(pw);
		
		
		CustomerDAO dao = new CustomerDAO();
		
		int x = dao.insert(dto);
		
		if(x == 1) {
			
			response.sendRedirect("login.html");
			
		}else {
			response.sendRedirect("First.html");
		}

		
	 System.out.println(name);
	 System.out.println(add);
	 System.out.println(email);
	 System.out.println(mob);
	 System.out.println(unm);
	 System.out.println(pw);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
