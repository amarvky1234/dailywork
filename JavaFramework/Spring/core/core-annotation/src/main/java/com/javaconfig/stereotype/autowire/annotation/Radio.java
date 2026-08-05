package com.javaconfig.stereotype.autowire.annotation;

//no sourcecode
public class Radio {
    private IReceiver receiver;

    public void listen(int station){
        receiver.receive(station);
        System.out.println("streaming station " + station);
    }

    public void setReceiver(IReceiver receiver) {
        this.receiver = receiver;
    }
}
