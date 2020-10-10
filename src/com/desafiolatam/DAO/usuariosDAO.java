package com.desafiolatam.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import  java.util.ServiceLoader;  //agregado para suplir className

import com.mysql.jdbc.Statement;


import com.desafiolatam.modelo.*;
import com.desafiolatam.procesaconexion.Conexion;


public class usuariosDAO extends Conexion{


	public boolean autenticacion (String nombre, String pass) {
	
		ResultSet rs =  null;
		PreparedStatement pst = null;
		
		try {
	
			String consulta = "select * from usuarios where nombre = ? and pass = ?" ;
			
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1, nombre);
			pst.setString(2, pass);
		
			rs = pst.executeQuery();
			

			if(rs.absolute(1)){
			
				return true;

			}else {
				System.out.println("error");
			}
			
		}catch (Exception e) {
			
			System.out.println("error feo");
		}finally {
			try {
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();
				if(rs != null ) rs.close();
			}catch(Exception e) {}
			
			
		}
		

		return false;
	}
	
public boolean registrar(String nombre, String correo, String pass) {
		
		PreparedStatement pst = null;
	
		
		try {
			String consulta = "insert into usuarios (nombre, correo, pass) values (?,?,?)";
			
			pst = getConexion().prepareStatement(consulta);
			
			
			pst.setString(1, nombre);
			pst.setString(2, correo);
			pst.setString(3, pass);


			
			// rs = pst.executeQuery();
			
			
			if(pst.executeUpdate() == 1) {
				
				return true;
				
			}
			
		}catch (Exception e) {
			 
			
				System.out.println("no se pudo inscribir al alumno");
			
		}
				
		return false;
	}

public List<usuariosDTO> obtenerUsuarios(){


try {
	
	//lista que recibira los objetos usuarios con la información de cada registro de la base de datos
	List<usuariosDTO> listaUsuarios = new ArrayList<usuariosDTO>();
	
	//consulta sql almacenada en un String
	String solicitudUsuarios= "select userid, nombre, pass, correo from usuarios";
	
	
	PreparedStatement pst = getConexion().prepareStatement(solicitudUsuarios);
	
	ResultSet rs = pst.executeQuery(solicitudUsuarios);
	
	System.out.println("base de datos conectada");
	
	while(rs.next()) {
		usuariosDTO usuario = new usuariosDTO();
		usuario.setUserid(rs.getInt("userid"));
		usuario.setNombre(rs.getString("nombre"));
		usuario.setCorreo(rs.getString("correo"));
		usuario.setPass(rs.getString("pass"));

		listaUsuarios.add(usuario);
//		System.out.println(rs.getString(1) +" "+rs.getString(2)+" "+rs.getString(3)+ " "+ rs.getString(4));
		
		System.out.println(rs.getString(1) +" "+rs.getString(2)+" "+rs.getString(3)+ " "+ rs.getString(4));
	}
	
	System.out.println(listaUsuarios);
	
	return listaUsuarios;
	
} catch (Exception e) {
	
	System.out.println("error de conexion");
	
	e.printStackTrace();
	return null;
}


}

public boolean eliminar (int userid){
	
	PreparedStatement pst = null;
	
	try {
		String solicitudEliminar = "delete from usuarios where userid = ?";
	
		

		pst = getConexion().prepareStatement(solicitudEliminar);
		
	
		pst.setInt(1, userid);
		

		pst.executeUpdate();
		
		System.out.println("usuario: "+ userid + " Eliminado correctamente ");
		
		
		
		return true;
	}catch(Exception e) {

		
		System.out.println("no se pudo eliminar " + userid);
	}
	return false;

	
}



public List<usuariosDTO> buscarUsuario (String name){


	try {
		//lista que recibira los objetos usuarios con la información de cada registro de la base de datos
		List<usuariosDTO> listaUsuarios = new ArrayList<usuariosDTO>();
		
		//consulta sql almacenada en un String
		String solicitudUsuarios= "select userid, nombre, correo from usuarios where nombre = ?";


			
		PreparedStatement pst = getConexion().prepareStatement(solicitudUsuarios);
		
		pst.setString(1, name);
		
		ResultSet rs = pst.executeQuery();
		
		System.out.println("base de datos conectada");
		
		while(rs.next()) {
			usuariosDTO usuario = new usuariosDTO();
			usuario.setUserid(rs.getInt("userid"));
			usuario.setNombre(rs.getString("nombre"));
			usuario.setCorreo(rs.getString("correo"));
			//usuario.setPass(rs.getString("pass"));

			listaUsuarios.add(usuario);
//			System.out.println(rs.getString(1) +" "+rs.getString(2)+" "+rs.getString(3)+ " "+ rs.getString(4));
			
			System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		System.out.println(listaUsuarios);
		
		return listaUsuarios;
		
			
	} catch (Exception e) {
		System.out.println("error");
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
		
}



public boolean Modificar (int userid, String nombre, String correo){
	
	PreparedStatement pst = null;
	
	try {
		
		String solicitudUpdate = "UPDATE usuarios SET nombre=?, correo=? WHERE userid = ?";

		pst = getConexion().prepareStatement(solicitudUpdate);
		pst.setString(1, nombre);
		pst.setString(2, correo);
		pst.setInt(3, userid);
        
		
		pst.executeUpdate();
		
		System.out.println("Modificado correctamente ");
		
		
	return true;
	}catch(Exception e) {

		
		System.out.println("no se pudo eliminar " + userid);
		return false;
	}
				}
		}
