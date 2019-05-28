package model;

public class UsuarioVip extends Usuario {
	
	public UsuarioVip(){
		super();
	}
	
	public UsuarioVip(String nombre, String dni) {
		super(nombre, dni);
	}

	public boolean esVip(){
		return true;
	}
	
	public boolean agregarCarrito() {
		if(this.getCarritoActual() == null) 
		{
			this.setCarritoActual(new CarritoVip());
			return true;
		}
	
		return false;
	}
}
