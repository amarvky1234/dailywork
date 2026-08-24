package com.rv.initializer;

import com.rv.config.RVRootConfig;
import com.rv.config.RVWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RVDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RVRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {RVWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"*.htm"};
    }
}
