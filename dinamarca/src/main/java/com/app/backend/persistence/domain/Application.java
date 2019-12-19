package com.app.backend.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the app database table.
 * 
 */
@Entity
@Table(name="aplicacion")
public class Application {

	@Id
	@Column(name = "idAplicacion")
	private int idApplication;

	@Column(name = "codigoQr", length = 100)
	private String codigoQr;
	
	@Column(name = "ubicacion", length = 100)
	private int ubicacion;
	
	@Column(name = "imei", length = 50)
	private String imei;
	
	@Column(name = "fecha")
	private Date fecha;

	public Application() {
	}

	public int getIdApplication() {
		return this.idApplication;
	}

	public void setIdApplication(int idApplication) {
		this.idApplication = idApplication;
	}

	public String getCodigoQr() {
		return codigoQr;
	}

	public void setCodigoQr(String codigoQr) {
		this.codigoQr = codigoQr;
	}

	public int getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
}