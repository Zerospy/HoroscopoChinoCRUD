<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.desafiolatam.DAO.usuariosDAO" %>
    <%@page import="com.desafiolatam.modelo.usuariosDTO" %>
    <%@page import="java.util.ArrayList" %>
    <%ArrayList userRec = (ArrayList)request.getAttribute("userRec"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla de </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<% 
			List<usuariosDTO> usuarios = new ArrayList();
					usuariosDAO dao = new usuariosDAO();

		
			
			usuarios = dao.obtenerUsuarios();
	%>
 
<body><nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Horoscopo Chino App </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Inicio<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
      
        <a class="nav-link" href="ListaUsuarios">Listar usuarios</a>
      
      </li>
          <li class="nav-item">
      
        <a class="nav-link" href="modificarUsuarios">Modificar usuarios</a>
      
      </li>
          <li class="nav-item">
      
        <a class="nav-link" href="eliminarUsuarios">Eliminar usuarios</a>
      
      </li>
      <li class="nav-item">
        <a class="nav-link" href="inicioSesion.jsp" tabindex="-1">Logout</a>
      </li>
    </ul>
  </div>
</nav>


	
	<table border="1px" class="mx-auto mt-3">
		<tr> 
		 <td>UserId</td> <td>Nombre</td> <td>Correo</td>
		 		  <% for (int contador = 0; contador < userRec.size() ; contador++) {  %>
		  		<tr>   
		  		<% usuariosDTO user =  (usuariosDTO)userRec.get(contador);  %>
		  		
		  				<td>
		  			<%= user.getUserid() %>
		  				</td>
		  		<td>
		  			<%= user.getNombre() %>
		  			</td>
		  				<td>
		  			<%= user.getCorreo() %>
		  			</td>
		  		
		  			</tr>
		  <%  } %>


		</tr>


	
	
	</table>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>