package repository.imp;

import model.Producto;
import repository.bi.ProductoRepositoryBI;

public class HibernateProductoRepository extends BaseHibernateRepository implements ProductoRepositoryBI{

	@Override
	public Producto getProducto(Long idproducto) {
		Producto producto = (Producto) this.getSession().createQuery("FROM Producto P WHERE P.id ="+idproducto ).list().iterator().next();
		return producto;
	}

}
