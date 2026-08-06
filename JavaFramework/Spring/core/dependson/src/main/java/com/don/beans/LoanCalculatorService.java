package com.don.beans;

import com.don.helper.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component
@DependsOn("cacheManager")
public class LoanCalculatorService {
    @Autowired
    private Cache cache;

    public LoanCalculatorService(){
        System.out.println("loanCalculatorService()");
    }

    public double calculateInterestAmount(double principalAmount,
                                          int tenure,
                                          int cibilScore,
                                          String loanType,
                                          String city) throws IOException {
        Properties properties = null;
        double interestAmount = 0.0;
        double roi = 0.0;

        properties = (Properties) cache.get("cibilscoreri");
        String range = (String) properties.keySet().stream().filter(key->{
            String[] splits = ((String) key).split("-");
            if(cibilScore >= Integer.parseInt(splits[0]) && cibilScore <= Integer.parseInt(splits[1])){
                return true;
            }
            return false;
        }).findFirst().get();

        roi = Double.parseDouble((String) properties.get(range));

        interestAmount = (principalAmount*tenure*roi)/100;
        return interestAmount;
    }
}
