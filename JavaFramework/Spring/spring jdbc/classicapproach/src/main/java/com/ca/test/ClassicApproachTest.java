package com.ca.test;

import com.ca.bo.StudentBo;
import com.ca.config.JavaConfig;
import com.ca.dao.CourseDao;
import com.ca.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassicApproachTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);
        //studentDao.findStudentBetweenAge(21,29).stream().forEach(System.out::println);
        //studentDao.findAllStudents().stream().forEach(System.out::println);
        //studentDao.findStudentByGender("Female").stream().forEach(System.out::println);

        /*int record = studentDao.saveStudent
                (StudentBo.of().studentNo(5).studentName("Robert").age(34).gender("Male").mobileNo("7568908768").emailAddress("robert@gmai.com").build());

        System.out.println(" record inserted : "+ record);*/

        CourseDao courseDao = context.getBean(CourseDao.class);
        courseDao.findAllCourses().stream().forEach(System.out::println);
    }
}
