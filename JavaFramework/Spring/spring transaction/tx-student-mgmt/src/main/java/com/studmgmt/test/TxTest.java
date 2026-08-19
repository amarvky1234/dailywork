package com.studmgmt.test;

import com.studmgmt.command.StudentEnrollmentCommand;
import com.studmgmt.controller.EnrollStudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        StudentEnrollmentCommand command = StudentEnrollmentCommand.of().studentName("Ralph")
                                .age(23)
                                .gender("Male")
                                .mobileNo("7856894324")
                                .emailAddress("ralph@gmail.com")
                                .courseNo(20).build();
        EnrollStudentController studentController = applicationContext.getBean(EnrollStudentController.class);
        int studentNo = studentController.enrollStudent(command);
        System.out.println("studentNo : " + studentNo);
    }
}
