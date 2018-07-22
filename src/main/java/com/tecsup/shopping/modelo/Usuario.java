package com.tecsup.shopping.modelo;

public class Usuario {
	
	private String cuenta;
	private String clave;
	private String direccion;
	
	public Usuario(String cuenta, String clave, String direccion) {
		super();
		this.cuenta = cuenta;
		this.clave = clave;
		this.direccion = direccion;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [cuenta=" + cuenta + ", clave=" + clave + ", direccion=" + direccion + "]";
	}
	
	

}
