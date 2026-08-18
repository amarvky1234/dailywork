package com.qa.test;

import com.qa.bo.StudentBo;
import com.qa.config.JavaConfig;
import com.qa.dao.AutoStudentDao;
import com.qa.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class QATest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);
        //studentDao.findStudentsWithCourses("Male").forEach(System.out::println);

        studentDao.findStudentByPage(2).forEach(System.out::println);

        /*long totalStudent = studentDao.countStudents();
        System.out.println("Total Students : "+totalStudent);

        String studentName = studentDao.findStudentNameByStudentNo(4);
        System.out.println("StudentName : "+ studentName);

        StudentBo studentBo = studentDao.findStudentDetailsByStudentNo(2);
        System.out.println(studentBo);*/

        //studentDao.findStudentByGender("Female").forEach(System.out::println);
        //studentDao.findStudentContact(20, 30).forEach(System.out::println);

        /*int record = studentDao.saveStudent(StudentBo.of().studentNo(7)
                .studentName("RihannaP").age(23).gender("Female").mobileNo("7865342907").emailAddress("rihannap@gmail.com").build());
        System.out.println("record : "+record);*/

        /*int record = studentDao.deleteStudent(String.valueOf(7));
        System.out.println(record+" record deleted from student");*/

        /*AutoStudentDao dao = context.getBean(AutoStudentDao.class);
        int studentNo = dao.saveStudentNP(StudentBo.of().studentName("DavidW")
                .age(29).gender("Male").mobileNo("7834546407").emailAddress("wdavid@gmail.com").build());
        System.out.println("StudentNo : "+studentNo);*/
    }
}
