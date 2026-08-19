package com.studmgmt.test;

import com.studmgmt.Exception.UnknownCourseException;
import com.studmgmt.command.StudentEnrollmentCommand;
import com.studmgmt.config.RootConfig;
import com.studmgmt.controller.EnrollStudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTxTest {
    public static void main(String[] args) throws UnknownCourseException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
        StudentEnrollmentCommand command = StudentEnrollmentCommand.of().studentName("Rick W")
                .age(32).gender("Male").mobileNo("7446838334").emailAddress("rick@gmail.com").courseNo(2).build();
        EnrollStudentController controller = applicationContext.getBean(EnrollStudentController.class);
        int studentNo = controller.enrollStudent(command);
        System.out.println("studentNo : "+studentNo);
    }
}
