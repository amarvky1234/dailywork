package com.qualifier.stereotypejavaconfig.annotation;

//no sourcecode
public class AirtelSetTopBoxImpl implements ISetTopBox{
    @Override
    public void stream(String channelNo) {
        System.out.println("airtel settop box is streaming channel : " + channelNo);
    }
}
