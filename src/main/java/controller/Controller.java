package controller;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Controller{
	
	protected Map<String, Object> aMap = new HashMap<String, Object>();
	protected String json;
	
	protected Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}

	protected Gson getGson(){
		 final GsonBuilder builder = new GsonBuilder();
		 builder.excludeFieldsWithoutExposeAnnotation();
		 final Gson gson = builder.create();
		 return gson;
	}
}