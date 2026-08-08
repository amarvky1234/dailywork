package com.i18n.filetest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileWrierI18N {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:/notes.txt" , Charset.forName("UTF-8"));
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("मूलभूत सिद्धांत");
        bufferedWriter.close();
    }
}
