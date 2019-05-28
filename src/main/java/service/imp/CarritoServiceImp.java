package service.imp;

import org.springframework.transaction.annotation.Transactional;

import dto.CarritoDTO;
import dto.DTOFactory;
import model.Carrito;
import model.Producto;
import model.Usuario;
import repository.RepositoryLocator;
import service.bi.CarritoServiceBI;

@Transactional
public class CarritoServiceImp implements CarritoServiceBI{

	@Override
	public CarritoDTO agregarCarrito(Carrito carrito) {
		// TODO Auto-generated method stub
		Usuario usuario = RepositoryLocator.getInstance().getUsuarioRepository().getUsuario(carrito.getId());
		
		if(usuario.agregarCarrito())
		{
			return DTOFactory.getInstance().getCarritoDTO(usuario.getCarritoActual());
		}
		else return null;
	}

	@Override
	public CarritoDTO getCarrito(Carrito carrito) {
		Usuario usuario  = RepositoryLocator.getInstance().getUsuarioRepository().getUsuario(carrito.getId());
		return DTOFactory.getInstance().getCarritoDTO(usuario.getCarritoActual());
	}

	@Override
	public boolean borrarCarrito(Long id) {
		Usuario usuario  = RepositoryLocator.getInstance().getUsuarioRepository().getUsuario(id);
		usuario.borrarActual();
		return true;
	}

	@Override
	public CarritoDTO agregarProducto(Long id, Long idproducto) {
		Producto producto = RepositoryLocator.getInstance().getProductoRepository().getProducto(idproducto);
		Carrito carrito = RepositoryLocator.getInstance().getCarritoRepository().getCarrito(id);
	
		carrito.addProducto(producto);
		return DTOFactory.getInstance().getCarritoDTO(carrito);
	}

	@Override
	public CarritoDTO quitarProducto(Long id, Long idproducto) {
		Producto producto = RepositoryLocator.getInstance().getProductoRepository().getProducto(idproducto);
		Carrito carrito = RepositoryLocator.getInstance().getCarritoRepository().getCarrito(id);
		carrito.quitarProducto(producto);
		return DTOFactory.getInstance().getCarritoDTO(carrito);
	}

	@Override
	public CarritoDTO pagar(Long id) {
		Carrito carrito = RepositoryLocator.getInstance().getCarritoRepository().getCarrito(id);
		Usuario usuario = RepositoryLocator.getInstance().getUsuarioRepository().getUsuarioCarrito(id);
		usuario.historico();
		carrito.pagar();
		return DTOFactory.getInstance().getCarritoDTO(carrito);
	}

}
