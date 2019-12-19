package com.app.backend.utilities.DTO;

import java.util.Date;

public class ApplicationDTO {
	
	private int idApplication;
	private String codigoQr;
	private int ubicacion;
	private String imei;
	private Date fecha;
	
	public int getIdApplication() {
		return idApplication;
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
