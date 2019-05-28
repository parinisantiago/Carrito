package model;

public class CarritoNormal extends Carrito {

	public CarritoNormal() {
		super();
	}

	public CarritoNormal(Double precio) {
		super(precio);
	}

	public void pagar() {
		int tam = this.getProductos().size();
		if(tam == 5){
			this.setDescuento(this.getPrecio() * 20 / 100);
		} else if (tam > 10){
			this.setDescuento(200.00);
		}
		this.descontar();
	}
	
}
