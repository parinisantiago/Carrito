package util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//clase para obtener el application context
public class DanaideContextProvider implements ApplicationContextAware {

	public DanaideContextProvider() {
		super();
	}

	//setea el appliction context
	@Override
	public void setApplicationContext(ApplicationContext aContext) throws BeansException {
		DanaideApplicationContext.setApplicationContext(aContext);
	}
}