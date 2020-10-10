package com.desafiolatam.modelo;

public class usuariosDTO {
private int userid;
private String nombre;
private String correo;
private String pass;
public usuariosDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public usuariosDTO(int userid, String nombre, String correo, String pass) {
	super();
	this.userid = userid;
	this.nombre = nombre;
	this.correo = correo;
	this.pass = pass;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
