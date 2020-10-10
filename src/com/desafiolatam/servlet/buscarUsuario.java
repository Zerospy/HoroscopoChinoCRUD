package com.desafiolatam.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.DAO.usuariosDAO;
import com.desafiolatam.modelo.usuariosDTO;

/**
 * Servlet implementation class buscarUsuario
 */
@WebServlet("/buscarUsuario")
public class buscarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscarUsuario() {
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
						
		    	String name = request.getParameter("name");
		    	//Aca deberia capturar la data del objeto del usuariosDAO buscarUsuario
		    	
		    	usuariosDAO udao = new usuariosDAO();
		      
		   
		    	List<usuariosDTO> usuarios = new ArrayList();
				usuarios = 	udao.buscarUsuario(name);
			
				
//
	
		
	  		
				System.out.println("array "+ usuarios.size());
//		  		
				for (int contador = 0; contador < usuarios.size() ; contador++) {
					
					usuariosDTO user =  (usuariosDTO)usuarios.get(contador);
					
					int userid = user.getUserid();
					String nombre = user.getNombre();
					String correo = user.getCorreo();
					String pass = user.getPass();
					
		  request.setAttribute("userid", userid );
		  request.setAttribute("usuarioNombre", nombre );
		  request.setAttribute("usuarioCorreo", correo );
			request.setAttribute("usuarioPass", pass);
				
				
				System.out.println(correo + "en clase buscarUsuario");
				
				String useridString = String.valueOf(userid);
				
				session.setAttribute("userid", useridString	);
//				session.setAttribute("usuarioNombre", nombre);
//				session.setAttribute("usuarioCorre", correo);
			
				}
				
// usuarios.get(1).getNombre();
//		  		 
//		  		user.getUserid(); 
	  		 	
//		  		usuar
//		  				
//		  		 user.getCorreo();
					
		
		  	   
		  //  	System.out.println(nombre);
		    	///////////////
		    //	
		    	
		     // A ciencia cierta a traves del uso de request deberia llenar los campos
		   	// del modify
		    	
		    	
		    	//
		    //String nombre = udao.buscarUsuario(name);
		    //		udao.buscarUsuario(name);
			// System.out.println(user.getNombre());
		    //System.out.println(udao.buscarUsuario(name));
		    		//  udao.buscarUsuario(name);
	
		   
		   
		   	RequestDispatcher rd = request.getRequestDispatcher("modificarUsuario.jsp");
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
