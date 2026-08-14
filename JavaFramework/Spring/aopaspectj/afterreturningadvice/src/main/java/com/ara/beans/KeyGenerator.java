package com.ara.beans;

import org.springframework.stereotype.Component;

@Component
public class KeyGenerator {
    public int generate(int length){
        if(length < 8){
            return 0;
        }
        return 1;
    }
}
