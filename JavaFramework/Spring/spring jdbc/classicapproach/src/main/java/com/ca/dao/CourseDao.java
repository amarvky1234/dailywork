package com.ca.dao;

import com.ca.bo.CourseBo;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class CourseDao {
    private final static String SQL_FIND_ALL_COURSES = "select course_no, course_nm, duration, fee from course order by course_nm";
    private final static String SQL_FIND_COURSE_BETWEEN_FEE = "select course_no, course_nm, duration, fee from course where fee between :minPrice and :maxPrice";
    private final JdbcTemplate jdbcTemplate;

    public List<CourseBo> findAllCourses(){
        return jdbcTemplate.execute(new CourseStatementCallback());
    }

    private final class CourseStatementCallback implements StatementCallback<List<CourseBo>>{

        @Override
        public List<CourseBo> doInStatement(Statement stmt) throws SQLException, DataAccessException {
            final ResultSet resultSet = stmt.executeQuery(SQL_FIND_ALL_COURSES);
            final List<CourseBo> courseBos = new ArrayList<>();

            while (resultSet.next()){
                courseBos.add(CourseBo.of().courseNo(resultSet.getInt(1))
                        .courseName(resultSet.getString(2))
                        .duration(resultSet.getInt(3))
                        .fee(resultSet.getDouble(4)).build());
            }
            return courseBos;
        }
    }

    public List<CourseBo> findAll(){
        return jdbcTemplate.execute(new CourseConnectionCallback());
    }

    private final class CourseConnectionCallback implements ConnectionCallback<List<CourseBo>>{

        @Override
        public List<CourseBo> doInConnection(Connection con) throws SQLException, DataAccessException {
            final PreparedStatement ps  = con.prepareStatement(SQL_FIND_ALL_COURSES);
            final ResultSet rs = ps.executeQuery();
            final List<CourseBo> courseBos = new ArrayList<>();

            while (rs.next()){
                courseBos.add(CourseBo.of().courseNo(rs.getInt(1))
                        .courseName(rs.getString(2))
                        .duration(rs.getInt(3))
                        .fee(rs.getDouble(4)).build());
            }
            return courseBos;
        }
    }
}
