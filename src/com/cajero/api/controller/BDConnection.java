package com.cajero.api.controller;
import java.sql.Connection;
import java.sql.DriverManager;

public class BDConnection {

	private Connection connection;

	private static BDConnection instance;

	private BDConnection() {
		crearConeccionInicial();
	}

	private void crearConeccionInicial() {
		String url = "jdbc:mysql://localhost:3306/cajero_automatico";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

	public static BDConnection getInstance() {

		if (instance == null) {
			instance = new BDConnection();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

	
	public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
	
	
	
	
	
	
	
	
	
	
}
