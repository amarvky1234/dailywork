package com.stereotype.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("machine")
//@Controller("machine")
//@Service("machine")
@Repository("machine")
public class Robot {
    public void walk(int feet, String direction){
        System.out.println("walking "+feet +" feet in "+direction+" direction");
    }
}
