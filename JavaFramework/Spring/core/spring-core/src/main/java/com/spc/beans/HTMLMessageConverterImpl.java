package com.spc.beans;

public class HTMLMessageConverterImpl implements IMessageConverter{
    @Override
    public String convertMessage(String message) {

        return "<html><body>"+message+"<body><html>";
    }
}
