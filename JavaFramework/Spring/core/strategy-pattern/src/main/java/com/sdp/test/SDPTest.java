package com.sdp.test;

import com.sdp.beans.*;
import com.sdp.helper.AppFactory;
import com.sdp.helper.MessageConverterFactory;

import java.io.IOException;

public class SDPTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        IMessageConverter htmlMessageConverter = (IMessageConverter) AppFactory.createObject("htmlMessageConverter");
        IMessageConverter pdfMessageConverter = (IMessageConverter) AppFactory.createObject("pdfMessageConverter");

        MessageWriter messageWriter = (MessageWriter)  AppFactory.createObject("messageWriter");
        messageWriter.setMessageConverter(pdfMessageConverter);

        DigitalBoard digitalBoard = (DigitalBoard) AppFactory.createObject("digitalBoard");
        digitalBoard.setMessageConverter(htmlMessageConverter);

        messageWriter.writeMessage("Welcome to strategy Design Pattern");
        digitalBoard.on("Welcome to Strategy Design Pattern");
    }
}
