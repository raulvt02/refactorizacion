package com.endes;

public class Main {
	
	public static void main(String[] args) {
    Spaghettiproducts sp = new Spaghettiproducts();
    sp.addProduct("Monitor", 250);
    sp.addProduct("Teclado", 50);
    sp.addProduct("Mouse", 25);
    sp.addProduct("Impresora", 150);
    sp.listProducts();
    sp.findProduct("Teclado");
    sp.findProduct("Scanner"); 
	}
}