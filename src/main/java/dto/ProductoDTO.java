package dto;

import com.google.gson.annotations.Expose;

import model.Producto;

public class ProductoDTO {
	@Expose
	private Long id;
	@Expose
	private String nombre;
	@Expose
	private Double precio;

	public ProductoDTO() {
		super();
	}
	public ProductoDTO(Producto producto) {
		this.nombre = producto.getNombre();
		this.precio = producto.getPrecio();
		this.id = producto.getId();
	}
	

}
