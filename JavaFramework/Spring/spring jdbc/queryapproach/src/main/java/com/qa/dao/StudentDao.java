package com.qa.dao;

import com.qa.bo.CourseBo;
import com.qa.bo.StudentBo;
import com.qa.bo.StudentCourseBo;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class StudentDao {
    private final static String SQL_COUNT_OF_STUDENT = "select count(1) from student";
    private final static String SQL_FIND_STUDENT_NAME_BY_STUDENT_NO = "select student_nm from student where student_no = :studentNo";
    private final static String SQL_FIND_STUDENT_BY_STUDENT_NO = "select student_no, student_nm, age, gender, mobile_nbr, email_address from student where student_no = :studentNo";
    private final static String SQL_FIND_STUDENT_BY_GENDER = "select student_no, student_nm, age, gender, mobile_nbr, email_address from student where gender = :gender";
    private final static String SQL_FIND_STUDENT_CONTACT = "select student_nm, mobile_nbr, email_address from student where age between :minAge and :maxAge";
    private final static String SQL_INSERT_STUDENT = "insert into student(student_no, student_nm, age, gender, mobile_nbr, email_address) values(:studentNo, :studentName, :age, :gender, :mobileNo, :emailAddress)";
    private final static String SQL_DELETE_STUDENT = "delete from student where student_no = :studentNo";
    private final static String SQL_FIND_STUDENT_WITH_COURSES = "select s.student_no, s.student_nm, s.age, s.gender, s.mobile_nbr, s.email_address, c.course_no, c.course_nm, c.duration, c.fee from student s inner join student_course sc on s.student_no=sc.student_no inner join course c on c.course_no = sc.course_no where s.gender=:gender";
    private final static String SQL_FIND_STUDENT_ORDER_BY_STUDENT_NAME = "select student_no, student_nm, age, gender, mobile_nbr, email_address from student order by student_nm";
    private NamedParameterJdbcTemplate npJdbcTemplate;

    private final RowMapper<StudentBo> studentRowMapper = (rs, rowNum) -> {
        return StudentBo.of().studentNo(rs.getInt(1))
                .studentName(rs.getString(2))
                .age(rs.getInt(3))
                .gender(rs.getString(4))
                .mobileNo(rs.getString(5))
                .emailAddress(rs.getString(6)).build();
    };

    public long countStudents(){
        return npJdbcTemplate.queryForObject(SQL_COUNT_OF_STUDENT, Map.of(), Long.class);
    }

    public String findStudentNameByStudentNo(final int studentNo){
        return npJdbcTemplate.queryForObject(SQL_FIND_STUDENT_NAME_BY_STUDENT_NO, Map.of("studentNo", studentNo), String.class);
    }

    public StudentBo findStudentDetailsByStudentNo(final int studentNo){
        return npJdbcTemplate.queryForObject(SQL_FIND_STUDENT_BY_STUDENT_NO, Map.of("studentNo", studentNo), studentRowMapper);
    }

    public List<StudentBo> findStudentByGender(final String gender){
        return npJdbcTemplate.query(SQL_FIND_STUDENT_BY_GENDER, Map.of("gender", gender), studentRowMapper);
    }

    public List<Map<String, Object>> findStudentContact(final int minAge, final int maxAge){
        return npJdbcTemplate.queryForList(SQL_FIND_STUDENT_CONTACT, Map.of("minAge", minAge, "maxAge", maxAge));
    }

    public int saveStudent(StudentBo bo){
        return npJdbcTemplate.update(SQL_INSERT_STUDENT, Map.of("studentNo", bo.getStudentNo(),
                                                            "studentName", bo.getStudentName(),
                                                            "age", bo.getAge(),
                                                            "gender", bo.getGender(),
                                                            "mobileNo", bo.getMobileNo(),
                                                            "emailAddress", bo.getEmailAddress()));
    }

    public int deleteStudent(final String studentNo){
        return npJdbcTemplate.update(SQL_DELETE_STUDENT, Map.of("studentNo", studentNo));
    }

    //roll-up logic
    final public List<StudentCourseBo> findStudentsWithCourses(final String gender) {
        return npJdbcTemplate.query(SQL_FIND_STUDENT_WITH_COURSES, Map.of("gender", gender), (rs) -> {
            List<StudentCourseBo> studentCourseBos = null;
            Map<Integer, StudentCourseBo> studentCourseBoMap = new HashMap<>();
            CourseBo courseBo = null;
            StudentCourseBo studentCourseBo = null;
            int studentNo = 0;

            while (rs.next()) {
                studentNo = rs.getInt(1);

                if (studentCourseBoMap.containsKey(studentNo) == false) {
                    studentCourseBo = (StudentCourseBo) StudentCourseBo.of()
                            .studentNo(rs.getInt(1))
                            .studentName(rs.getString(2))
                            .age(rs.getInt(3))
                            .gender(rs.getString(4))
                            .mobileNo(rs.getString(5))
                            .emailAddress(rs.getString(6))
                            .courses(new ArrayList<>())
                            .build();
                    studentCourseBoMap.put(studentNo, studentCourseBo);
                }
                studentCourseBo = studentCourseBoMap.get(studentNo);
                studentCourseBo.getCourses().add(CourseBo.of()
                        .courseNo(rs.getInt(7))
                        .courseName(rs.getString(8))
                        .duration(rs.getInt(9))
                        .fee(rs.getDouble(10)).build());

            }

            studentCourseBos = studentCourseBoMap.values().stream().toList();
            return studentCourseBos;
        });
    }

    //pagination
    final public List<StudentBo> findStudentByPage(final int pageNo){
        final int pageSize = 3;
        final int startIndex = ((pageNo - 1)* pageSize) + 1;
        final int endIndex = pageNo * pageSize;

        return npJdbcTemplate.query(SQL_FIND_STUDENT_ORDER_BY_STUDENT_NAME, (rs) -> {
            List<StudentBo> studentBos = new ArrayList<>();
            int row = 1;

            while(rs.next() && row <= endIndex){
                if (row >= startIndex){
                    studentBos.add(StudentBo.of().studentNo(rs.getInt(1))
                            .studentName(rs.getString(2))
                            .age(rs.getInt(3))
                            .gender(rs.getString(4))
                            .mobileNo(rs.getString(5))
                            .emailAddress(rs.getString(6)).build());
                }
                row++;
            }
            return studentBos;
        });
    }
}
