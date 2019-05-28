package dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.google.gson.annotations.Expose;

import model.Carrito;
import model.Producto;

public class CarritoDTO {
	@Expose
	private Long id;
	@Expose
	private Collection<ProductoDTO> productos;
	@Expose
	private Double precio;
	@Expose
	private Double descuento;

	public CarritoDTO() {
		super();
	}

	public CarritoDTO(Carrito carrito) {
		super();
		this.id = carrito.getId();
		this.productos = new HashSet<ProductoDTO>();
		this.precio = carrito.getPrecio();
		this.descuento = carrito.getDescuento();
		
		if(carrito.getProductos() != null){
			Iterator<Producto> productoI = carrito.getProductos().iterator();
			while(productoI.hasNext()) {
				this.productos.add(new ProductoDTO(productoI.next()));
			}
		}
	}
	

	public Collection<ProductoDTO> getProductos() {
		return productos;
	}

	public void setProductos(Collection<ProductoDTO> productos) {
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
	
	
}
