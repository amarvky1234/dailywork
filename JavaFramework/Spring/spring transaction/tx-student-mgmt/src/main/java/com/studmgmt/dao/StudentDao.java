package com.studmgmt.dao;

import com.studmgmt.bo.StudentBo;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class StudentDao {
    private final String SQL_INSERT_STUDENT = "insert into student(student_nm, age, gender, mobile_nbr, email_address) values(:studentName, :age, :gender, :mobileNo, :emailAddress)";
    private NamedParameterJdbcTemplate npJdbcTemplate;

    public StudentDao(NamedParameterJdbcTemplate npJdbcTemplate) {
        this.npJdbcTemplate = npJdbcTemplate;
    }

    public int saveStudent(StudentBo studentBo){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        npJdbcTemplate.update(SQL_INSERT_STUDENT, new BeanPropertySqlParameterSource(studentBo), keyHolder, new String[]{"student_no"});
        return keyHolder.getKey().intValue();
    }
}
