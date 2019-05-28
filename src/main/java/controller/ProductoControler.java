package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import service.ServiceLocator;

@ControllerAdvice
@RequestMapping("/producto")
@ResponseBody
@EnableWebMvc
public class ProductoControler extends Controller {

	@RequestMapping(value = "/example", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String prueba() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "funciona");
		return new Gson().toJson(aMap);
	}
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String productos() {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Productos", ServiceLocator.getInstance().getProductoService().getProductos());
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
}
