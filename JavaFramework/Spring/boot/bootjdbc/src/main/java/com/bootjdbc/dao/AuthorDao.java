package com.bootjdbc.dao;

import com.bootjdbc.bo.AuthorBo;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
@AllArgsConstructor
public class AuthorDao {
    private final String SQL_INSERT_AUTHOR = "insert into author(author_id, full_nm, dob, gender, contact_no, email_address) values(:authorId, :fullName, :dob, :gender, :contactNo, :emailAddress)";
    private final String SQL_GET_ALL_AUTHOR = "select author_id, full_nm, dob, gender, contact_no, email_address from author";
    private final NamedParameterJdbcTemplate npJdbcTemplate;

    public int saveAuthor(AuthorBo bo){
        final SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(bo);
        return npJdbcTemplate.update(SQL_INSERT_AUTHOR, sqlParameterSource);
    }

    public List<AuthorBo> findAll(){
        return npJdbcTemplate.query(SQL_GET_ALL_AUTHOR, (ResultSet rs, int rowNum) ->{
            return AuthorBo.of()
                    .authorId(rs.getInt(1))
                    .fullName(rs.getString(2))
                    .dob(rs.getDate(3).toLocalDate())
                    .gender(rs.getString(4))
                    .emailAddress(rs.getString(5))
                    .contactNo(rs.getString(6)).build();
        });
    }
}
