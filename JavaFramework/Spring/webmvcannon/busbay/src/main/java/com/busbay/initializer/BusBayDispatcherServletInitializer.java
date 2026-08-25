package com.busbay.initializer;

import com.busbay.config.BusBayRootConfig;
import com.busbay.config.BusBayWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BusBayDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {BusBayRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {BusBayWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"*.htm"};
    }
}
