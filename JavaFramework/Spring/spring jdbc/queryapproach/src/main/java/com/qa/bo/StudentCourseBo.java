package com.qa.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder(builderMethodName = "of")
@ToString(callSuper = true)
public class StudentCourseBo extends StudentBo{
    private List<CourseBo> courses;
}
