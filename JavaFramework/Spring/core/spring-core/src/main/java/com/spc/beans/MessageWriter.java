package com.spc.beans;

public class MessageWriter {
    private IMessageConverter messageConverter;

    public  void writeMessage(String message){
        String cmessage = null;

        cmessage = messageConverter.convertMessage(message);
        System.out.println(cmessage);
    }

    public void setMessageConverter(IMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }
}
