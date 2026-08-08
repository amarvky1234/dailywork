package com.ji18n.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {
    public static void main(String[] args) {
        Locale locale = new Locale("hi", "IN");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale);
        System.out.println(resourceBundle.getString("home_introPara"));
    }
}
