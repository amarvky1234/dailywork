package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class University {
    private Map<String, Course> courseHodMap;
    private Properties courseTopper;

    public University(Map<String, Course> courseHodMap, Properties courseTopper) {
        this.courseHodMap = courseHodMap;
        this.courseTopper = courseTopper;
    }

    @Override
    public String toString() {
        return "University{" +
                "courseHodMap=" + courseHodMap +
                ", courseTopper=" + courseTopper +
                '}';
    }
}
