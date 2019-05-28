package repository.bi;


import java.util.Collection;

import model.Producto;
import model.Usuario;

public interface UsuarioRepositoryBI extends BaseRepositoryBI {

	public Usuario getUsuario(Long id);
	public Usuario getUsuarioCarrito(Long id);
	public Collection<Producto> top(String dni);
}
