package com.cajero.api.test;

import com.cajero.api.controller.*;

public class Test {

	public static void main(String[] args) {
		
		if(BDConnection.getInstance().getConnection() == null) {
		
			System.out.println("No se hizo la coneccion");
			
		} else {
			System.out.println("Se hizo la coneccion");
		}
		
		BaseController controladorBase = new BaseController();
		
		controladorBase.readFrom("Select * from Usuario");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
