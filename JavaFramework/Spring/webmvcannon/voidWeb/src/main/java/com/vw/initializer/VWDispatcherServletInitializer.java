package com.vw.initializer;

import com.vw.config.VWRootConfig;
import com.vw.config.VWWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class VWDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {VWRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {VWWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"*.htm"};
    }
}
