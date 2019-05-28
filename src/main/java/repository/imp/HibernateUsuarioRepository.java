package repository.imp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import model.Producto;
import model.Usuario;
import repository.bi.UsuarioRepositoryBI;

public class HibernateUsuarioRepository extends BaseHibernateRepository implements UsuarioRepositoryBI{

	public Usuario getUsuario(Long id)
	{
		Usuario usuario = (Usuario)this.getSession().createQuery("FROM Usuario U WHERE U.id ="+id ).list().iterator().next();
		return usuario;
	}

	public Usuario getUsuarioCarrito(Long id) {
		Usuario usuario = (Usuario)this.getSession().createQuery("FROM Usuario U WHERE U.carritoActual ="+id ).list().iterator().next();
		return usuario;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Producto> top(String dni) {
		Collection<Producto> productos =   this.getSession().createQuery("SELECT DISTINCT cp FROM Usuario U INNER JOIN U.carritos C INNER JOIN C.productos cp WHERE U.id ="+dni+" ORDER BY cp.precio DESC").setFirstResult(0).setMaxResults(4).list();
		return productos;
	}

}
