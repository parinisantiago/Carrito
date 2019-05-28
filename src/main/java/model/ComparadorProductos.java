package model;

import java.util.Comparator;

public class ComparadorProductos implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		return o1.getPrecio().compareTo(o2.getPrecio());
	}
	
}
