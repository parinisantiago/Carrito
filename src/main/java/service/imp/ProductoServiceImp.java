package service.imp;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import dto.DTOFactory;
import dto.ProductoDTO;
import repository.RepositoryLocator;
import service.bi.ProductoServiceBI;


@Transactional
public class ProductoServiceImp implements ProductoServiceBI{

	@Override
	public Collection<ProductoDTO> getProductos() {
		return DTOFactory.getInstance().getDanaideDTO(RepositoryLocator.getInstance().getDanaideRepository().getDanaide()).getProductos();
	}

	
}
