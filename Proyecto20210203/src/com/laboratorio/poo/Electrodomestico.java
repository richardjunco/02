//Paquete com.laboratorio.poo
package com.laboratorio.poo;

// Definicion de la clase Electrodomestico
public class Electrodomestico {
	// Definicion de atributos : Lineaproduccion, Dimensiones, Tipoconexion
	
	// Lineaproduccion puede ser: Domestico o Industrial
	String Lineaproduccion;
	// Dimensiones puede ser: ancho, largo y alto en cm
	String Dimensiones;
	// Tipoconexion puede ser: monofásico o trifasico
	String Tipoconexion;
	
	// Metodo Constructor de la clase Electrodomestico
	public Electrodomestico(String lineaproduccion, String dimensiones, String tipoconexion) {
		super();
		Lineaproduccion = lineaproduccion;
		Dimensiones = dimensiones;
		Tipoconexion = tipoconexion;
	}

	// Metodo Set ( Colocar ) y Get (Obtener)
	// Get Lineaproduccion
	public String getLineaproduccion() {
		return Lineaproduccion;
	}
	// Set Lineaproduccion
	public void setLineaproduccion(String lineaproduccion) {
		Lineaproduccion = lineaproduccion;
	}
	// Get Dimensiones
	public String getDimensiones() {
		return Dimensiones;
	}
	// Set Dimensiones
	public void setDimensiones(String dimensiones) {
		Dimensiones = dimensiones;
	}
	// Get Tipoconexion
	public String getTipoconexion() {
		return Tipoconexion;
	}
	// Set Tipoconexion
	public void setTipoconexion(String tipoconexion) {
		Tipoconexion = tipoconexion;
	}

	// Metodo ToString : Mostrar datos
	@Override
	public String toString() {
		return "Electrodomestico [Lineaproduccion=" + Lineaproduccion + ", Dimensiones=" + Dimensiones
				+ ", Tipoconexion=" + Tipoconexion + "]";
	}
}
