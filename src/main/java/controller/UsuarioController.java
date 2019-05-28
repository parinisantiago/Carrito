package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import model.Carrito;
import service.ServiceLocator;

@ControllerAdvice
@RequestMapping("/usuario")
@ResponseBody
@EnableWebMvc
public class UsuarioController extends Controller {
	
	@RequestMapping(value = "/example", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String prueba() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "funciona");
		return new Gson().toJson(aMap);
	}
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String usuarios() {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Usuarios", ServiceLocator.getInstance().getUsuarioService().getUsuarios());
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/top", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String top(@RequestParam("dni") String dni) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Productos", ServiceLocator.getInstance().getUsuarioService().getProductos(dni));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
}
