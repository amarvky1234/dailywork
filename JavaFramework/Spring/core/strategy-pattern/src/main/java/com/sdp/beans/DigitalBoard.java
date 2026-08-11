package com.sdp.beans;

import com.sdp.helper.AppFactory;

public class DigitalBoard {
    private IMessageConverter messageConverter;

    public  void on(String message) {
        String cMessage =null;

        //messageConverter = new PDFMessageConverterImpl();
        //messageConverter = AppFactory.createObject("messageConverter");

        cMessage = messageConverter.convertMessage(message);
        System.out.println(cMessage);
    }

    public void setMessageConverter(IMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }
}
