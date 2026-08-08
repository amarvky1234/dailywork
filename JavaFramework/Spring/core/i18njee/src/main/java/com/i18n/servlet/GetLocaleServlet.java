package com.i18n.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Locale;

@WebServlet(urlPatterns = {"/i18nlocale"})
public class GetLocaleServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Locale locale = Locale.getDefault();
        System.out.println("System:  Country : " + locale.getCountry() +"  language : " + locale.getLanguage());
    }
}
