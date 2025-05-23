package com.univ.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.univ.DAO.UserDAO;
import com.univ.DTO.UserDTO;

/**
 * Servlet implementation class SignupUser
 */
@WebServlet("/SignupUser")
public class SignupUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SignupUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("unm");
		String mob = request.getParameter("mob");
		String password = request.getParameter("pw");
		
		UserDTO dto = new UserDTO();
		
		dto.setUserName(userName);
		dto.setPassword(password);
		dto.setMob(Long.parseLong(mob));
		
		UserDAO dao = new UserDAO();
		
		int x = dao.insert(dto);
		
		if(x == 1) {
			response.sendRedirect("LoginPage.html");
		}else {
			response.sendRedirect("SignupPage.html");
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
