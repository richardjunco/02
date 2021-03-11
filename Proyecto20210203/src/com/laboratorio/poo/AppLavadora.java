package com.laboratorio.poo;

public class AppLavadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lavadora Lavadora1 = new Lavadora("Domestico","100x80x120","Monofásico","Lavadora Premium Familiar","LG","Serie Marzo","8Litros");
		Lavadora Lavadora2 = new Lavadora("Industrial","150x150x150","Trifásico","Lavadora Industrial","LG","Industrial", "50Litros");
		
		System.out.println(Lavadora1.toString());
		System.out.println(Lavadora2.toString());
		
	}

}
