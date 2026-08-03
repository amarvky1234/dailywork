package com.bfpp.postprocessor;

import com.bfpp.beans.RazorPaymentService;
import com.bfpp.beans.ZellePaymentService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceBeanFactoryPostProcessing implements BeanFactoryPostProcessor, EnvironmentAware {
    private Environment environment;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String region = environment.getProperty("region");
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;

        if(region.equals("IND")){
            registry.registerBeanDefinition("razorPaymentService", BeanDefinitionBuilder.genericBeanDefinition(RazorPaymentService.class).getBeanDefinition());
        } else if (region.equals("USA")) {
            registry.registerBeanDefinition("zellePaymentService", BeanDefinitionBuilder.genericBeanDefinition(ZellePaymentService.class).getBeanDefinition());
        }
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
