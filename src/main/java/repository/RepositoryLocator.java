package repository;

import repository.bi.DanaideRepositoryBI;
import repository.bi.CarritoRepositoryBI;
import repository.bi.ProductoRepositoryBI;
import repository.bi.UsuarioRepositoryBI;

public class RepositoryLocator {
	
	private static RepositoryLocator instance = null;
	private ProductoRepositoryBI productoRepository;
	private DanaideRepositoryBI danaideRepository;
	private CarritoRepositoryBI carritoRepository;
	private UsuarioRepositoryBI usuarioRepository;

	public static RepositoryLocator getInstance(){
		if(instance == null){
			instance = new RepositoryLocator();
		}
		return instance;
	}

	public ProductoRepositoryBI getProductoRepository() {
		return productoRepository;
	}

	public void setProductoRepository(ProductoRepositoryBI productoRepository) {
		this.productoRepository = productoRepository;
	}

	public DanaideRepositoryBI getDanaideRepository() {
		return danaideRepository;
	}

	public void setDanaideRepository(DanaideRepositoryBI danaideRepository) {
		this.danaideRepository = danaideRepository;
	}

	public CarritoRepositoryBI getCarritoRepository() {
		return carritoRepository;
	}

	public void setCarritoRepository(CarritoRepositoryBI carritoRepository) {
		this.carritoRepository = carritoRepository;
	}

	public UsuarioRepositoryBI getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepositoryBI usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
}