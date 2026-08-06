package com.don.config;

import com.don.accessor.IAccessor;
import com.don.helper.Cache;
import com.don.helper.CacheManager;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Collections;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.don.beans", "com.don.accessor"})
@PropertySource("classpath:app.properties")
public class DONConfigClass implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Bean
    public Cache cache(){
        return Cache.getInstance();
    }

    @Bean
    public CacheManager cacheManager(Cache cache){
        CacheManager cacheManager = null;
        List<IAccessor> accessors = null;

        accessors = Collections.singletonList(applicationContext.getBean(IAccessor.class));
        cacheManager = new CacheManager(cache, accessors);

        return cacheManager;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
