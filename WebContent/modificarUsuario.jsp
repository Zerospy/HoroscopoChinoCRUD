<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.desafiolatam.DAO.usuariosDAO" %>
    <%@page import="com.desafiolatam.modelo.usuariosDTO" %>
    <%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Modificar usuario </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>

<style>
.login-form {
    width: 340px;
    margin: 50px auto;
  	font-size: 15px;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
	align-text: right;
    font-size: 15px;
    font-weight: bold;
}
</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
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
		<h3>Modificar usuario 	  </h3>
	
<div class="container">
	<form action="modificarUsuario">
	  		<div class="form-group">
		    <label for="nombre">ID</label>    													
		    <input type="text" class="form-control" id="userid" name="userid" value=" ${userid}"  disabled> 
		  </div>	
		  <div class="form-group">										
		    <label for="nombre">Nombre de usuario</label>    			
		    <input type="text" class="form-control" id="nombre" name="name" value=" ${usuarioNombre}"> 
		  </div>																	 
		  <div class="form-group">
		    <label for="telefono">Correo electronico</label>
		    <input type="text" class="form-control" id="correo" name="correo" value="${usuarioCorreo}">
		  </div>
		  
		  
	
		  		  <button type="submit" class="btn btn-primary btn-block">Modificar</button>
	</form>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

</body>
</html>