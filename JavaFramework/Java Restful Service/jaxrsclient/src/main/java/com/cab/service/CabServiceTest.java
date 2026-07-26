package com.cab.service;

public class CabServiceTest {
    public static void main(String[] args) {
        CabService cabService = new CabService();
        String rideDetails = cabService.ride
                ("Ammerpet", "Hi-Tech City", "Regular Cab", "dhieh33", "Re5r66");
        System.out.println(rideDetails);
    }
}
