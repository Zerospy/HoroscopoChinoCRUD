package com.desafiolatam.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.DAO.usuariosDAO;
import com.desafiolatam.modelo.usuariosDTO;

/**
 * Servlet implementation class modificarUsuario
 */
@WebServlet("/modificarUsuario")
public class modificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarUsuario() {
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
		
	  	usuariosDAO udao = new usuariosDAO();
	      
    	String useridS = (String) session.getAttribute("idUsuario");
    	String nombre = request.getParameter("name");
    	String correo = request.getParameter("correo");
    	int userid = Integer.parseInt(useridS);
    	
    	System.out.println(correo);
    	udao.Modificar(userid, nombre, correo);
    	
    	
    	//System.out.println(name);
    			
    	//List<usuariosDTO> usuarios = new ArrayList();
		//usuarios = 	udao.buscarUsuario(name);
	
		
//


		
	///	System.out.println("array "+ usuarios.size());
////  		
//		for (int contador = 0; contador < usuarios.size() ; contador++) {
//			
//			usuariosDTO user =  (usuariosDTO)usuarios.get(contador);
//			
//			int userid = user.getUserid();
//			String nombre = user.getNombre();
//			String correo = user.getCorreo();
//			String pass = user.getPass();
//			
//	    request.setAttribute("userid", userid );
//		request.getSession().setAttribute("usuarioNombre", nombre );
//		request.setAttribute("usuarioCorreo", correo );
//		request.setAttribute("usuarioPass", pass);
//		
//		
//		
//					System.out.println(userid);
//	
//		}
	//	String nombre = request.getSession().getAttribute("usuarioNombre");
		
// request.getSession().getAttribute(nombre);
	//	System.out.println("USER ID: "+ request.getParameter(nombre));
//		
//		String nombre = request.getParameter("name");
//		String correo = request.getParameter("correo");
//	   
//		usuariosDAO udao = new usuariosDAO();
//		
//		udao.Modificar(userid, nombre, correo);
////		String nombre = udao.buscarUsuario(name);
//		
//
//		 
		 
		response.sendRedirect("modificarUsuario.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
