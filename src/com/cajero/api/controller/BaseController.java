package com.cajero.api.controller;

import java.sql.ResultSet;
import java.sql.Statement;

public class BaseController {
	
	public BaseController() {
	}
	
	public ResultSet readFrom(String consulta) {
		
		try {
			Statement statement = BDConnection.getInstance().getConnection().createStatement();
			
			ResultSet resultado = statement.executeQuery(consulta);
			
			while (resultado.next()) {
				int id = resultado.getInt("idUsuario");
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellido");
				
				System.out.println("Id: "+ id +", nombre: "+ nombre +", apellido: "+ apellido);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
