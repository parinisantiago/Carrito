package model;

import java.util.Collections;

public class CarritoVip extends Carrito {

	public CarritoVip() {
		super();
	}

	public CarritoVip(Double precio) {
		super(precio);
	}
	
	public void pagar() {
		int tam = this.getProductos().size();
		if(tam == 5){
			this.setDescuento(this.getPrecio() * 20 / 100);
		} else if (tam > 10){
			Producto prodMenor = Collections.min(this.getProductos(), new ComparadorProductos()); 
			this.setDescuento(700.00 + prodMenor.getPrecio());
		}
		this.descontar();
	}
}
