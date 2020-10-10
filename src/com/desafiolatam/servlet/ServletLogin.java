package com.desafiolatam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.DAO.usuariosDAO;
import com.desafiolatam.servlet.*;
/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    		
    						
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter pw = response.getWriter();
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("password");
		
	
		//	request.setAttribute("login", new AlumnoDAO().autenticacion(nombre, contrasena));
		
		System.out.println(nombre + pass);
		
			usuariosDAO dao = new usuariosDAO();
			
			
			if(dao.autenticacion(nombre, pass)) {
					response.sendRedirect("index.jsp");	
					
					
			}else{
				System.out.println("Usuario o password Incorrectos");
				response.sendRedirect("inicioSesion.jsp");
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
