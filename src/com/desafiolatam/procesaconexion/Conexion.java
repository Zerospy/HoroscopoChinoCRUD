package com.desafiolatam.procesaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	
	private String USERNAME ="root";
	private String PASSWORD = "admin";
	private String HOST = "localhost";
	private String PORT = "3306";
	private String DATABASE = "horoscopo";
	private String CLASSNAME = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
	private Connection con;
	
		public Conexion () {
			
		
				try {
					Class.forName(CLASSNAME);
					con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
					
					System.out.println("connection succed");
					
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("connection alright!");
					e.printStackTrace();
						  }
						}
		
		public Connection getConexion() {
			
			
			return con;
		}
		
		public static void main (String []args ) 
		{
			Conexion con = new Conexion();
			
		}
		
		
}
