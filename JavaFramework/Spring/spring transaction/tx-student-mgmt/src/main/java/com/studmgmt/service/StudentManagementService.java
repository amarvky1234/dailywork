package com.studmgmt.service;

import com.studmgmt.bo.StudentBo;
import com.studmgmt.bo.StudentCourseBo;
import com.studmgmt.command.StudentEnrollmentCommand;
import com.studmgmt.dao.StudentCourseDao;
import com.studmgmt.dao.StudentDao;

public class StudentManagementService {
    private StudentDao studentDao;
    private StudentCourseDao studentCourseDao;

    public void setStudentCourseDao(StudentCourseDao studentCourseDao) {
        this.studentCourseDao = studentCourseDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int enrollStudent(StudentEnrollmentCommand command){
        int studentNo = 0;
        StudentBo studentBo = null;
        StudentCourseBo studentCourseBo = null;

        studentBo = StudentBo.of().studentName(command.getStudentName())
                .age(command.getAge())
                .gender(command.getGender())
                .mobileNo(command.getMobileNo())
                .emailAddress(command.getEmailAddress())
                .build();

        studentNo = studentDao.saveStudent(studentBo);

        studentCourseBo = StudentCourseBo.of().courseNo(command.getCourseNo())
                .studentNo(studentNo).build();

        studentCourseDao.saveStudentCourse(studentCourseBo);

        return studentNo;
    }
}
