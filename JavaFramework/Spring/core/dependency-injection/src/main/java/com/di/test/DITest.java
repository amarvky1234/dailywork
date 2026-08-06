package com.di.test;

import com.di.beans.WeatherWidget;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DITest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/di/common/application-context.xml"));

        WeatherWidget weatherWidget = (WeatherWidget) beanFactory.getBean("weatherWidget");
        weatherWidget.showWeather("74563");
    }
}
