package model;

import java.util.Random;

public class UsuarioNormal extends Usuario {
	public UsuarioNormal(){
		super();
	}
	
	public UsuarioNormal(String nombre, String dni) {
		super(nombre,dni);
	}

	public boolean esVip(){
		return false;
	}
	public boolean agregarCarrito() {
		if(this.getCarritoActual() == null)
		{
			if (this.esFechaEspecial()) this.setCarritoActual(new CarritoEspecial());
			else this.setCarritoActual(new CarritoNormal());
			return true;
		}
		return false;
	}
	public boolean esFechaEspecial(){
		Random random = new Random();
		return random.nextBoolean();
	}
}
