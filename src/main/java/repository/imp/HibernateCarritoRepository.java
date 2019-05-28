package repository.imp;

import repository.bi.CarritoRepositoryBI;

import model.Carrito;

public class HibernateCarritoRepository extends BaseHibernateRepository implements CarritoRepositoryBI{

	@Override
	public Carrito getCarrito(Long id) {
		Carrito carrito = (Carrito) this.getSession().createQuery("FROM Carrito C WHERE C.id ="+id ).list().iterator().next();
		return carrito;
	}

	

}
