package com.studmgmt.dao;

import com.studmgmt.bo.StudentCourseBo;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class StudentCourseDao {
    private final String SQL_INSERT_STUDENT_COURSE = "insert into student_course(student_no, course_no) values(:studentNo, :courseNo)";
    private final NamedParameterJdbcTemplate npJdbcTemplate;

    public void saveStudentCourse(StudentCourseBo studentCourseBo){
        npJdbcTemplate.update(SQL_INSERT_STUDENT_COURSE, new BeanPropertySqlParameterSource(studentCourseBo));
    }
}
