package com.desafiolatam.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.DAO.usuariosDAO;

/**
 * Servlet implementation class eliminarUsuarioPost
 */
@WebServlet("/eliminarUsuarioPost")
public class eliminarUsuarioPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eliminarUsuarioPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		HttpSession session = request.getSession();
		
		
		usuariosDAO udau = new usuariosDAO ();
		
		String userIdStr = request.getParameter("userid");
		int userid = Integer.parseInt(userIdStr);

			System.out.println(userid);
		udau.eliminar(userid);
		
		RequestDispatcher rd = request.getRequestDispatcher("eliminarUsuarios");
	   	rd.forward(request, response);
	   	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
