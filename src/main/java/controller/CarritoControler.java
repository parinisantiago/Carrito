package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import model.Carrito;
import service.ServiceLocator;

@ControllerAdvice
@RequestMapping("/carrito")
@ResponseBody
@EnableWebMvc
public class CarritoControler extends Controller{

	@RequestMapping(value = "/example", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String prueba() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "funciona");
		return new Gson().toJson(aMap);
	}
		
	@RequestMapping(value = "/nuevo", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String nuevo(@RequestBody Carrito carrito) {
		try {
			this.aMap = new HashMap<String, Object>();
			ServiceLocator.getInstance().getCarritoService().agregarCarrito(carrito);
			this.aMap.put("Carrito", ServiceLocator.getInstance().getCarritoService().getCarrito(carrito));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/borrar", method = RequestMethod.PUT, produces = "application/json", headers = "Accept=application/json")
	public String borrar(@RequestBody Carrito carrito) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Borrado", ServiceLocator.getInstance().getCarritoService().borrarCarrito(carrito.getId()));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.PUT, produces = "application/json", headers = "Accept=application/json")
	public String agregar(@RequestBody Carrito carrito) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Carrito", ServiceLocator.getInstance().getCarritoService().agregarProducto(carrito.getId(),carrito.getProducto()));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/quitar", method = RequestMethod.PUT, produces = "application/json", headers = "Accept=application/json")
	public String quitar(@RequestBody Carrito carrito) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Carrito", ServiceLocator.getInstance().getCarritoService().quitarProducto(carrito.getId(),carrito.getProducto()));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/pagar", method = RequestMethod.PUT, produces = "application/json", headers = "Accept=application/json")
	public String pagar(@RequestBody Carrito carrito) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Carrito", ServiceLocator.getInstance().getCarritoService().pagar(carrito.getId()));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
}
