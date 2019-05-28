package model;

import java.util.Collection;
import java.util.HashSet;

public class Carrito {
	
	private Long id;
	private Collection<Producto> productos;
	private Double descuento;
	private Double precio;
	
	public Carrito() {
		super();
		this.productos = new HashSet<Producto>();
		this.precio = 0.0;
		this.descuento = 0.0;
	}

	public Carrito(Double precio) {
		super();
		this.productos = new HashSet<Producto>();
		this.precio = precio;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getProducto() {
		return this.productos.iterator().next().getId();
	}

	public void addProducto(Producto producto) {
		if(!this.productos.contains(producto)){
			this.precio += producto.getPrecio();
			this.productos.add(producto);
		}
	}

	public void quitarProducto(Producto producto) {
		if(this.productos.contains(producto)){
			this.precio -= producto.getPrecio();
			this.productos.remove(producto);
		}
	}

	public void pagar() {
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	public void descontar(){
		this.precio -= this.descuento;
	}
}
