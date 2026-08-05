package com.cdi.test;

import com.cdi.beans.Course;
import com.cdi.beans.University;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

public class CDITest {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("com/cdi/common/application-context.xml"));

        /*Course course = beanFactory.getBean("course", Course.class);
        System.out.println(course);*/

        University university = beanFactory.getBean("university", University.class);
        System.out.println(university);
    }
}
