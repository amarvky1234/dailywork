package com.studmgmt.controller;

import com.studmgmt.Exception.UnknownCourseException;
import com.studmgmt.command.StudentEnrollmentCommand;
import com.studmgmt.service.StudentManagementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class EnrollStudentController {
    private final StudentManagementService studentManagementService;

    public int enrollStudent(StudentEnrollmentCommand command) throws UnknownCourseException {
        int studentNo = 0;
        studentNo = studentManagementService.enrollStudent(command);
        return studentNo;
    }
}
