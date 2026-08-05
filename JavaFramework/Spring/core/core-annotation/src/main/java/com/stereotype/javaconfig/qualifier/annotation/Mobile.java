package com.stereotype.javaconfig.qualifier.annotation;

// no sourcecode
public class Mobile {
    private INetworkProvider networkProvider;

    public void reqSim(String packageName, String cid){
        String provider = networkProvider.eSim(packageName, cid);
        System.out.println("registering the mobile onto the network provider with eSim : " +provider);
    }

    public void setNetworkProvider(INetworkProvider networkProvider) {
        this.networkProvider = networkProvider;
    }
}
