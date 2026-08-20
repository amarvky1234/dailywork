package com.aw.initializer;

import com.aw.config.RootConfig;
import com.aw.config.WebConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AnnotationMvcWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext  rootApplicationContext = null;
        AnnotationConfigWebApplicationContext servletApplicationContext = null;
        ContextLoaderListener contextLoaderListener = null;
        DispatcherServlet dispatcherServlet = null;

        //parent ioc
        rootApplicationContext = new AnnotationConfigWebApplicationContext(); //empty
        rootApplicationContext.register(RootConfig.class);

        contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
        servletContext.addListener(contextLoaderListener);

        //child ioc
        servletApplicationContext = new AnnotationConfigWebApplicationContext();
        servletApplicationContext.register(WebConfig.class);

        dispatcherServlet = new DispatcherServlet(servletApplicationContext);
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("*.htm");
    }
}
