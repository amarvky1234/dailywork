package com.studmgmt.controller;

import com.studmgmt.command.StudentEnrollmentCommand;
import com.studmgmt.service.StudentManagementService;

public class EnrollStudentController {
    private StudentManagementService studentManagementService;

    public EnrollStudentController(StudentManagementService studentManagementService) {
        this.studentManagementService = studentManagementService;
    }

    public int enrollStudent(StudentEnrollmentCommand command){
        int studentNo = 0;

        studentNo = studentManagementService.enrollStudent(command);

        return studentNo;
    }
}
