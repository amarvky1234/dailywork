package com.ar.beans;

import java.security.SecureRandom;
import java.util.List;

public class BillManager {
    public double generalBill(List<String> products){
        System.out.println("generating bill");

        return new SecureRandom().nextDouble(Double.parseDouble("20000"));
    }
}
