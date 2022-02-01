package configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletConfig implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webcontext = new AnnotationConfigWebApplicationContext();
		webcontext.register(sessionConfig.class);
		DispatcherServlet dispatcherservlet = new DispatcherServlet(webcontext);
	ServletRegistration.Dynamic mydispatcher = servletContext.addServlet("mydispatchersevlet", dispatcherservlet);
	
	mydispatcher.addMapping("/");
	mydispatcher.setLoadOnStartup(1);
		
	}
	
	

}
