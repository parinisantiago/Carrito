package service.imp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.transaction.annotation.Transactional;

import dto.DTOFactory;
import dto.ProductoDTO;
import dto.UsuarioDTO;
import model.Producto;
import repository.RepositoryLocator;
import service.bi.UsuarioServiceBI;


@Transactional
public class UsuarioServiceImp implements UsuarioServiceBI{

	@Override
	public Collection<UsuarioDTO> getUsuarios() {
		// TODO Auto-generated method stub
		
		return DTOFactory.getInstance().getDanaideDTO(RepositoryLocator.getInstance().getDanaideRepository().getDanaide()).getUsuarios();
	}

	@Override
	public Collection<ProductoDTO> getProductos(String dni) {
		// TODO Auto-generated method stub
		Collection<Producto> productos =  RepositoryLocator.getInstance().getUsuarioRepository().top(dni);
		Collection<ProductoDTO> productosDTO = new HashSet<ProductoDTO>();
		
		Iterator<Producto> productoI = productos.iterator();
		
		while(productoI.hasNext()) {
			productosDTO.add(new ProductoDTO(productoI.next()));
		}
		
		return productosDTO;
	}
	
	
	
}
