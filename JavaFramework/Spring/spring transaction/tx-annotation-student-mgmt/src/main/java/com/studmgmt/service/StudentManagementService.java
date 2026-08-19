package com.studmgmt.service;

import com.studmgmt.Exception.UnknownCourseException;
import com.studmgmt.bo.StudentBo;
import com.studmgmt.bo.StudentCourseBo;
import com.studmgmt.command.StudentEnrollmentCommand;
import com.studmgmt.dao.StudentCourseDao;
import com.studmgmt.dao.StudentDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class StudentManagementService {
    private final StudentDao studentDao;
    private final StudentCourseDao studentCourseDao;

    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED,
                    rollbackFor = {UnknownCourseException.class})
    public int enrollStudent(StudentEnrollmentCommand command) throws UnknownCourseException {
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

        studentCourseBo = StudentCourseBo.of().studentNo(studentNo).courseNo(command.getCourseNo()).build();
        studentCourseDao.saveStudentCourse(studentCourseBo);

        if(command.getCourseNo() == 3){
            throw new UnknownCourseException("unknown course");
        }

        return studentNo;
    }
}
