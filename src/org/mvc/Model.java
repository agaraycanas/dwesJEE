package org.mvc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Model {
	protected Connection db=null;
	protected Session ss=null;

	public Model() {
		// Inicialización de la conexión a la BD (para operaciones SQL)
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String schema = "test";
			String usuario = "root";
			String password = "";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/" + schema, usuario, password);
			this.db = con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Inicialización de la sesión Hibernate para operaciones de persistencia
		this.ss  = new Configuration().configure().buildSessionFactory().openSession();
		
	}
}
