package dto;
import model.Usuario;

import com.google.gson.annotations.Expose;

public class UsuarioDTO {
	@Expose
	private Long id;
	@Expose
	private String nombre;
	@Expose
	private boolean vip;
	@Expose 
	private CarritoDTO carrito;
	
	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.nombre = usuario.getNombre();
		this.vip = usuario.esVip();
		
		if(usuario.getCarritoActual() == null) this.carrito = null;
		else this.carrito = new CarritoDTO(usuario.getCarritoActual());
	}
	
	public Long getId() {
		return id;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public CarritoDTO getCarrito() {
		return carrito;
	}

	public void setCarrito(CarritoDTO carrito) {
		this.carrito = carrito;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
