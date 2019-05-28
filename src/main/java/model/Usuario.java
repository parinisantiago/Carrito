package model;

import java.util.Collection;
import java.util.HashSet;

public class Usuario {

	private Long id;
	private Collection<Carrito> carritos;
	private Carrito carritoActual;
	private String nombre;
	private String dni;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre,String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.carritos = new HashSet<Carrito>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Carrito> getCarritos() {
		return carritos;
	}

	public void setCarritos(Collection<Carrito> carritos) {
		this.carritos = carritos;
	}

	public Carrito getCarritoActual() {
		return carritoActual;
	}

	public void setCarritoActual(Carrito carritoActual) {
		this.carritoActual = carritoActual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean esVip(){
		return false;
	}
	
	public boolean noTieneActua(){
		return (this.carritoActual == null);
	}

	public boolean agregarCarrito() {
		return false;
	}

	public void borrarActual() {
		this.carritoActual = null;
	}

	public void historico() {
		this.carritos.add(this.carritoActual);
		this.borrarActual();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
