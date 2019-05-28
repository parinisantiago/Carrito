package service;

import service.bi.CarritoServiceBI;
import service.bi.UsuarioServiceBI;
import service.bi.ProductoServiceBI;

public class ServiceLocator {

	private static ServiceLocator instance = null;
	private CarritoServiceBI carritoService;
	private ProductoServiceBI productoService;
	private UsuarioServiceBI usuarioService;
	
	
	public static ServiceLocator getInstance(){
		if(instance == null){
			instance = new ServiceLocator();
		}
		return instance;
	}


	public CarritoServiceBI getCarritoService() {
		return carritoService;
	}


	public void setCarritoService(CarritoServiceBI carritoService) {
		this.carritoService = carritoService;
	}


	public ProductoServiceBI getProductoService() {
		return productoService;
	}


	public void setProductoService(ProductoServiceBI productoService) {
		this.productoService = productoService;
	}


	public UsuarioServiceBI getUsuarioService() {
		return usuarioService;
	}


	public void setUsuarioService(UsuarioServiceBI usuarioService) {
		this.usuarioService = usuarioService;
	}
	
}
