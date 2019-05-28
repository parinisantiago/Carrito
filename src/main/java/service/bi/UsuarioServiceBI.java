package service.bi;

import java.util.Collection;

import dto.ProductoDTO;
import dto.UsuarioDTO;

public interface UsuarioServiceBI {

	public Collection<UsuarioDTO> getUsuarios();

	public Collection<ProductoDTO> getProductos(String dni);
	
}
