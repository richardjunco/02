package com.laboratorio.poo;

//Herencia entre clases
public class Lavadora extends Electrodomestico{
	
	//Atributos de la clase
	String Descripcion;
	String Marca;
	String Modelo;
	String Capacidad;
	
	//Constructor de la clase 
	//Esta heredando lineaproduccion, dimensiones, tipoconexion
	public Lavadora(String lineaproduccion, String dimensiones, String tipoconexion, String descripcion, String marca,
			String modelo, String capacidad) {
		super(lineaproduccion, dimensiones, tipoconexion);
		Descripcion = descripcion;
		Marca = marca;
		Modelo = modelo;
		Capacidad = capacidad;
	}
	
	//Genera los Get y Set

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(String capacidad) {
		Capacidad = capacidad;
	}

	// Metodo ToString
	@Override
	public String toString() {
		return "Lavadora [Descripcion=" + Descripcion + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Capacidad="
				+ Capacidad + ", Lineaproduccion=" + Lineaproduccion + ", Dimensiones=" + Dimensiones
				+ ", Tipoconexion=" + Tipoconexion + "]";
	}
	
		
}
