package dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.google.gson.annotations.Expose;

import model.Danaide;
import model.Producto;
import model.Usuario;

public class DanaideDTO {
	@Expose
	private Collection<UsuarioDTO> usuarios;
	@Expose
	private Collection<ProductoDTO> productos;
	
	public DanaideDTO(){
		super();
	}
	
	public DanaideDTO(Danaide danaide) {
		super();
		
		this.usuarios = new HashSet<UsuarioDTO>();
		this.productos = new HashSet<ProductoDTO>();
		
		Iterator<Usuario> usuarioI = danaide.getUsuarios().iterator();
		while(usuarioI.hasNext()) {
			this.usuarios.add(new UsuarioDTO(usuarioI.next()));
		}
		
		Iterator<Producto> productoI = danaide.getProductos().iterator();
		while(productoI.hasNext()) {
			this.productos.add(new ProductoDTO(productoI.next()));
		}
		
	}
	
	public Collection<ProductoDTO> getProductos() {
		return productos;
	}


	public void setProductos(Collection<ProductoDTO> productos) {
		this.productos = productos;
	}


	public Collection<UsuarioDTO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Collection<UsuarioDTO> usuarios) {
		this.usuarios = usuarios;
	}
	
}
