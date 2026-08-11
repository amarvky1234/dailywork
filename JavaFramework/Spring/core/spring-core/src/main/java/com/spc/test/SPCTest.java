package com.spc.test;

import com.spc.beans.IMessageConverter;
import com.spc.beans.MessageWriter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SPCTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/spc/common/application-context.xml"));

        MessageWriter messageWriter = (MessageWriter) beanFactory.getBean("messageWriter");

        messageWriter.writeMessage("Welcome to spring core");
    }
}
