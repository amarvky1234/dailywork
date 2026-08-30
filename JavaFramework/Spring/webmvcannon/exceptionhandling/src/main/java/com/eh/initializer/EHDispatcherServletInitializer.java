package com.eh.initializer;

import com.eh.config.EHRootConfig;
import com.eh.config.EHWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EHDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {EHRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {EHWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"*.htm"};
    }
}
