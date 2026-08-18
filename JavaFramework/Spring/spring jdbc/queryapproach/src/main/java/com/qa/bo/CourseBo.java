package com.qa.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class CourseBo {
    private int courseNo;
    private String courseName;
    private int duration;
    private double fee;
}
