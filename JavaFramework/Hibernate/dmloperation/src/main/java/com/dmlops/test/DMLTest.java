package com.dmlops.test;

import com.dmlops.dao.TrafficChallanDao;
import com.dmlops.entities.TrafficChallan;

import java.time.LocalDate;

public class DMLTest {
    public static void main(String[] args) {

        TrafficChallanDao trafficChallanDao = new TrafficChallanDao();

        /*TrafficChallan trafficChallan = new TrafficChallan();
        trafficChallan.setChallanNo(5);
        trafficChallan.setVehicleRegistrationNo("TN03P6B76");
        trafficChallan.setDriversLicenseNo("URT747YT87");
        trafficChallan.setChallanDate(LocalDate.now());
        trafficChallan.setReasonForChallan("Speed Ticket");
        trafficChallan.setAmount(1200);*/

       /* int challanNo = trafficChallanDao.saveTrafficChallan(trafficChallan);
        System.out.println("challan No : "+challanNo);*/

        //trafficChallanDao.persistTrafficChallan(trafficChallan);

        trafficChallanDao.updateTrafficChallan(5, "Speed violation", 1600);
        System.out.println("updated");


    }
}
