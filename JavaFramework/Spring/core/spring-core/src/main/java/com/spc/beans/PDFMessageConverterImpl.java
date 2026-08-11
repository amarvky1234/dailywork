package com.spc.beans;

public class PDFMessageConverterImpl implements IMessageConverter{
    @Override
    public String convertMessage(String message) {
        return "<pdf>"+message+"<pdf>";
    }
}
