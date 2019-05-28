package service.bi;

import dto.CarritoDTO;
import model.Carrito;

public interface CarritoServiceBI {

	CarritoDTO agregarCarrito(Carrito carrito);

	CarritoDTO getCarrito(Carrito carrito);

	boolean borrarCarrito(Long id);

	CarritoDTO agregarProducto(Long id, Long idproducto);

	CarritoDTO quitarProducto(Long id, Long idproducto);

	CarritoDTO pagar(Long id);
	
}
