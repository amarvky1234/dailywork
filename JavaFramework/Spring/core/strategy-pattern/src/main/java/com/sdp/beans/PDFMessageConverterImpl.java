package com.sdp.beans;

public class PDFMessageConverterImpl implements IMessageConverter {
    @Override
    public String convertMessage(String message) {
        String pdfMessage = null;

        pdfMessage = "<pdf>" + message + "</pdf>";
        return pdfMessage;
    }
}
