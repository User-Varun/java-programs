package com.univ.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;


import com.univ.DAO.CustomerDAO;

/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/ImageServlet")
@MultipartConfig(maxFileSize = 16177215)
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String price = request.getParameter("imgprice");
		String type = request.getParameter("imgtype");
		
		InputStream in = null;
		String message = null;
		
		

		Part filePart = request.getPart("photo");
		String fnm = "C:\\Users\\admin\\Desktop\\java-programs\\eclipse-code\\HexaShop\\src\\main\\webapp\\assets\\images\\";
		
		if(filePart != null) {
			fnm = filePart.getSubmittedFileName();
			System.out.println(fnm);
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());
			
			in = filePart.getInputStream();
		}
		
		CustomerDAO dao = new CustomerDAO();
		
		int row = dao.uploadFile(fnm , price , type , in);
		
		if(row > 0) {
			message = "file uploaded and " + "Saved into database";
			response.sendRedirect("file.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
		System.out.println(message);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
