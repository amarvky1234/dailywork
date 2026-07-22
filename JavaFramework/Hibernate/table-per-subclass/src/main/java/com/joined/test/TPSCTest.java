package com.joined.test;

import com.joined.dao.TelevisionDao;
import com.joined.entities.LCDTelevision;
import com.joined.entities.LEDTelevision;
import com.joined.entities.Television;
import com.joined.helper.EMFRegistry;

public class TPSCTest {
    public static void main(String[] args) {
        try {
            TelevisionDao televisionDao = new TelevisionDao();
            /*Television television = new Television();
            television.setSerialNo("SN0067");
            television.setModelNo("Blue diamond color TV");
            television.setDimensions("24inch TV");
            television.setManufacturer("Sharp");
            television.setPrice(23000);*/

            /*LCDTelevision television = new LCDTelevision();
            television.setSerialNo("SN0056");
            television.setModelNo("Full HD LCD TV");
            television.setDimensions("32inch TV");
            television.setManufacturer("Samsung");
            television.setPrice(47000);
            television.setPanelType("A Panel");
            television.setResolution("21373");*/

            /*LEDTelevision television = new LEDTelevision();
            television.setSerialNo("SN4564");
            television.setModelNo("Micro LED Television");
            television.setDimensions("50inch TV");
            television.setManufacturer("LG");
            television.setPrice(123000);
            television.setLedTechnology("micro");
            television.setRefreshRate(90);

            int productCode = televisionDao.saveTelevision(television);
            System.out.println("ProductCode :" + productCode);*/

            Television television = televisionDao.findTelevision(1);
            System.out.println(television);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }

    }
}
