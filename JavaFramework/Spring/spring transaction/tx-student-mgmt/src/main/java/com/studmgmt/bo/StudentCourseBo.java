package com.studmgmt.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class StudentCourseBo {
    private int studentNo;
    private int courseNo;
}
