package com.sdp.beans;

import com.sdp.helper.MessageConverterFactory;

public class MessageWriter {
    private IMessageConverter messageConverter;

    //public MessageWriter(IMessageConverter messageConverter) {}

    public void setMessageConverter(IMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    public void writeMessage(String message){
        String convertedMessage = null;

        //messageConverter = new PDFMessageConverterImpl();
        //messageConverter = MessageConverterFactory.createMessageConverter("pdf");

        convertedMessage = messageConverter.convertMessage(message);
        System.out.println(convertedMessage);


    }
}
