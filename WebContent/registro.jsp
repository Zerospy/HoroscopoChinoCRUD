<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Registre su cuenta de usuario</title>
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
  <a class="navbar-brand" href="index.jsp">Horoscopo Chino!</a>
 		Registrate para saber mas!
</nav>


<div class="container">
	<form action="PosInscripcion">
		  <div class="form-group">
		    <label for="nombre">Nombre de usuario</label>
		    <input type="text" class="form-control" id="nombre" name="nombre">
		  </div>
		  <div class="form-group">
		    <label for="telefono">Correo electronico</label>
		    <input type="text" class="form-control" id="correo" name="correo">
		  </div>
		  <div class="form-group">
		    <label for="password">Contraseña</label>
		    <input type="password" class="form-control" id="password" name="password">
		  </div>
		   <div class="form-group">
		    <label for="password">Repita Contraseña</label>
		    <input type="password" class="form-control" id="email" name="password2">
		  </div>
		  
		  
		  <button type="submit" class="btn">Enviar</button>
	</form>
<div class="container">
		
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
		
		</body>
</html>