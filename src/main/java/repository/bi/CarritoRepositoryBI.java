package repository.bi;

import model.Carrito;


public interface CarritoRepositoryBI extends BaseRepositoryBI {

	Carrito getCarrito(Long id);
	
}
