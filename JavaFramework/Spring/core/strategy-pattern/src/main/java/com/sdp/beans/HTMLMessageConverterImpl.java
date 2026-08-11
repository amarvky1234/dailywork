package com.sdp.beans;

public class HTMLMessageConverterImpl implements IMessageConverter {

    @Override
    public String convertMessage(String message) {
        String htmlMessage = null;

        htmlMessage = "<html><body>" + message + "<body><html>";
        return htmlMessage;
    }
}
