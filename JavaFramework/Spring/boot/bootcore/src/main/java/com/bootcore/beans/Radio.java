package com.bootcore.beans;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Radio {
    private Receiver receiver;

    public void on(){
        receiver.init();
        System.out.println("listing the radio...");
    }
}
