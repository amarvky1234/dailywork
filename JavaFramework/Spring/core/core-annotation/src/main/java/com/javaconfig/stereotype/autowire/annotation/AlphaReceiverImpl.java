package com.javaconfig.stereotype.autowire.annotation;

import org.springframework.stereotype.Component;

//sourcecode
//@Component
public class AlphaReceiverImpl implements IReceiver{
    @Override
    public void receive(int frequency) {
        System.out.println("alpha receiver is receiving the signals at frequency " + frequency);
    }
}
