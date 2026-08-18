package com.ca.dao;

import com.ca.bo.StudentBo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class StudentDao {
    private final static String SQL_FIND_STUDENT_BETWEEN_AGE = "select student_no, student_nm, age, gender, mobile_nbr, email_address from student where age between :minAge and :maxAge";
    private final static String SQL_FIND_ALL_STUDENTS = "select student_no, student_nm, age, gender, mobile_nbr, email_address from student";
    private final static String SQL_FIND_STUDENT_BY_GENDER = "select student_no, student_nm, age, gender, mobile_nbr, email_address from student where gender = :gender";
    private final static String SQL_INSERT_STUDENT = "insert into student(student_no, student_nm, age, gender, mobile_nbr, email_address) values(:studentNo, :studentName, :age, :gender, :mobileNo, :emailAddress)";

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    //dynamic sql query
    final public List<StudentBo> findStudentBetweenAge(final int minAge, final int maxAge){
        final StudentStatementCallback studentStatementCallback = new StudentStatementCallback();
        final Map<String, Object> params =  Map.of("minAge", minAge, "maxAge", maxAge);

        final List<StudentBo> studentBos = namedParameterJdbcTemplate.execute(SQL_FIND_STUDENT_BETWEEN_AGE, params, studentStatementCallback);
        return studentBos;
    }

    //static sql query
    final public List<StudentBo> findAllStudents(){
        final StudentStatementCallback studentStatementCallback = new StudentStatementCallback();

        final List<StudentBo> studentBos = namedParameterJdbcTemplate.execute(SQL_FIND_ALL_STUDENTS, studentStatementCallback);
        return studentBos;
    }

    //using SQLParameterSource impl MapSqlParameterSource
    final public List<StudentBo> findStudentByGender(String gender){
        final StudentStatementCallback studentStatementCallback = new StudentStatementCallback();
        final MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("gender", gender);
        final List<StudentBo> studentBos = namedParameterJdbcTemplate.execute(SQL_FIND_STUDENT_BY_GENDER, parameterSource, studentStatementCallback);
        return studentBos;
    }

    //inserting the record using SQLParameterSource impl BeanPropertySqlParameterSource
    final public int saveStudent(StudentBo bo){
        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(bo);
        return namedParameterJdbcTemplate.execute(SQL_INSERT_STUDENT, parameterSource, ps -> {
            return ps.executeUpdate();
        });
    }

    private final class StudentStatementCallback implements PreparedStatementCallback<List<StudentBo>>{

        @Override
        public List<StudentBo> doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
            final ResultSet rs = ps.executeQuery();
            final List<StudentBo> studentBos = new ArrayList<>();

            while (rs.next()){
                studentBos.add(StudentBo.of().studentNo(rs.getInt(1))
                        .studentName(rs.getString(2))
                        .age(rs.getInt(3))
                        .gender(rs.getString(4))
                        .mobileNo(rs.getString(5))
                        .emailAddress(rs.getString(6)).build());
            }
            return studentBos;
        }
    }
}
