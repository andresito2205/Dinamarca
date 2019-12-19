package com.app.backend;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesApplication {
	public static String startProperties(String llave) {
		Properties config = new Properties();
		InputStream configInput = null;
		try {
			configInput = new FileInputStream("app.properties");
			config.load(configInput);
			return config.getProperty(llave);
		} catch (Exception e) {
			System.out.print("Error cargando configuración\n" + e.getMessage());
		}
		return null;
	}

}
