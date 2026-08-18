package com.qa.dao;

import com.qa.bo.StudentBo;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
@AllArgsConstructor
public class AutoStudentDao {
    private final static String SQL_INSERT_STUDENT = "insert into student(student_nm, age, gender, mobile_nbr, email_address) values(?, ?, ?, ?, ?)";
    private final static String SQL_INSERT_STUDENT_NP = "insert into student(student_nm, age, gender, mobile_nbr, email_address) values(:studentName, :age, :gender, :mobileNo, :emailAddress)";
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public int saveStudent(final StudentBo bo){
        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update((Connection con) ->{
            final PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_STUDENT, new String[]{"student_no"});
            preparedStatement.setString(1, bo.getStudentName());
            preparedStatement.setInt(2, bo.getAge());
            preparedStatement.setString(3, bo.getGender());
            preparedStatement.setString(4, bo.getMobileNo());
            preparedStatement.setString(5, bo.getEmailAddress());
            return preparedStatement;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    public int saveStudentNP(StudentBo bo){
        final KeyHolder keyHolder = new GeneratedKeyHolder();
        final SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(bo);

        namedParameterJdbcTemplate.update(SQL_INSERT_STUDENT_NP, parameterSource, keyHolder, new String[]{"student_no"});
        return keyHolder.getKey().intValue();
    }
}
