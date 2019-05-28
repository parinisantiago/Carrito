package model;

public class CarritoEspecial extends Carrito {

	public CarritoEspecial() {
		super();
	}

	public CarritoEspecial(Double precio) {
		super(precio);
	}

	public void pagar() {
		int tam = this.getProductos().size();
		if(tam == 5){
			this.setDescuento(this.getPrecio() * 20 / 100);
		} else if (tam > 10){
			this.setDescuento(500.00);
		}
		this.descontar();
	}
}
