package com.courier.service;

public class CourierServiceTest {
    public static void main(String[] args) {
        CourierService service = new CourierService();
        String trackingInfo = service.tracking("awb63738", 48387);
        System.out.println(trackingInfo);
    }
}
