package model;

import java.util.Collection;
import java.util.HashSet;

import dto.CarritoDTO;

public class Danaide {

	private long id;
	private Collection<Producto> productos;
	private Collection<Usuario> usuarios;	
	
	public Danaide() {
		super();
		this.productos = new HashSet<Producto>();
		this.usuarios = new HashSet<Usuario>();
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Collection<Producto> getProductos() {
		return productos;
	}


	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}


	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Collection<CarritoDTO> getCarrito() {
		// TODO Auto-generated method stub
		return null;
	}

}
