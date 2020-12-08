package edu.neu.hw4Q6.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.neu.hw4Q6.security.SecurityConfiguration;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
//    @Override
//    public void onStartup(ServletContext sc) throws ServletException {

        //Configuring spring security in app inilitlaizer. Alternate to web.xml
//        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
//        root.register(ApplicationConfig.class,SecurityConfiguration.class);
//        sc.addListener(new ContextLoaderListener(root)); 
//        
//        sc.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain"))
//          .addMappingForUrlPatterns(null, false, "/*");
//        
//        
//    	//Creating dispatcher servlet in appinitializer. Alternate to web.xml
//    	AnnotationConfigWebApplicationContext webContext1 = 
//                new AnnotationConfigWebApplicationContext();
//    	webContext1.setParent(root);
//    	webContext1.register(WebConfig.class);
//        ServletRegistration.Dynamic dispatcher = sc
//                    .addServlet("dispatcher", new DispatcherServlet(webContext1));
//        dispatcher.setLoadOnStartup(2);
//        dispatcher.addMapping("/*");
        
        ///Appcontext 
        
//        root.register(ApplicationConfig.class);
        
//    }

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		
		return new Class<?>[] { SecurityConfiguration.class,ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	
	}

	

}