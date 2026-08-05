package com.qualifier.stereotypejavaconfig.annotation;

//no sourcecode
public class TataskySetTopBoxImpl implements ISetTopBox{
    @Override
    public void stream(String channelNo) {
        System.out.println("Tatasky settop box is streaming channel : " + channelNo);
    }
}
