package com.sdp.helper;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class AppFactory {
    public static Object createObject(String lClasname) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object obj = null;
        Class clazz = null;
        Properties properties = null;
        String fqnClassname = null;

        properties = new Properties();
        properties.load(AppFactory.class.getClassLoader().getResourceAsStream("com/sdp/common/appClasses.properties"));

        fqnClassname = properties.getProperty(lClasname);
         clazz = Class.forName(fqnClassname);
        obj = clazz.newInstance();

        return obj;
    }
}
