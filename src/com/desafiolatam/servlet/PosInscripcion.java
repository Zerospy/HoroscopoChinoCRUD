package com.desafiolatam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.DAO.usuariosDAO;



/**
 * Servlet implementation class PosInscripcion
 */
@WebServlet("/PosInscripcion")
public class PosInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PosInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

		   PrintWriter out = response.getWriter();	
			  // Rescatando los valores del formulario
		   
		   
		   
		   String nombre = request.getParameter("nombre");
		   String correo = request.getParameter("correo");
		   String pass = request.getParameter("password");
		 
		   
		   usuariosDAO dao = new usuariosDAO();
		   
		   
		 if(dao.registrar(nombre, correo, pass)) {
			 	System.out.println("Enviando registrar");
			 	response.sendRedirect("index.jsp");
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
