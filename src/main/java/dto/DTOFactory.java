package dto;

import model.Carrito;
import model.Danaide;


public class DTOFactory {

	private static DTOFactory instance = null;
	
	
	public static DTOFactory getInstance(){
		if (instance == null) {
			instance = new DTOFactory();
		}
		return instance;
	}
	
	public DanaideDTO getDanaideDTO(Danaide danaide){
		return new DanaideDTO(danaide);
	}

	public CarritoDTO getCarritoDTO(Carrito carrito) {
		// TODO Auto-generated method stub
		return new CarritoDTO(carrito);
	}
	
}
