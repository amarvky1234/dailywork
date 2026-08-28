package com.ff.initializer;

import com.ff.config.FFRootConfig;
import com.ff.config.FFWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FFDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {FFRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {FFWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"*.htm"};
    }
}
