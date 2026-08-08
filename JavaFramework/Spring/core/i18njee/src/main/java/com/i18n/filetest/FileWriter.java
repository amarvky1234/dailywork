package com.i18n.filetest;

import java.io.*;

public class FileWriter {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(new File("D:/content.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        StringBuffer buffer = new StringBuffer();
        buffer.append("मूलभूत सिद्धांत");
        bos.write(buffer.toString().getBytes());
        bos.close();
    }
}
