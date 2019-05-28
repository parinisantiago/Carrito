package util;

import java.io.Serializable;
import org.springframework.context.ApplicationContext;

public class DanaideApplicationContext implements Serializable {
	private static final long serialVersionUID = -8314525704793980700L;

	private static ApplicationContext applicationContext;
	//para setear app context que es para inversion de control
	public static void setApplicationContext(ApplicationContext aContext) {
		applicationContext = aContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
