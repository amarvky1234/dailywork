package com.bookstore.dao;

import com.bookstore.bo.AuthorBo;
import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.Collections;

import static com.google.common.collect.ImmutableList.toImmutableList;

@Repository
@AllArgsConstructor
public class AuthorDao {
    private final String SQL_FIND_ALL_AUTHORS = "select author_id, full_nm, dob, gender, contact_no, email_address from author";
    private final String SQL_CNT_AUTHORS_BY_CONTACT_NO = "select count(1) from author where contact_no = :contactNo";
    private final String SQL_CNT_AUTHORS_BY_EMAIL_ADDRESS = "select count(1) from author where email_address = :emailAddress";
    private final String SQL_SAVE_AUTHOR = "insert into author(author_id, full_nm, dob, gender, contact_no, email_address) values(:authorId, :fullName, :dob, :gender, :contactNo, :emailAddress)";
    private final NamedParameterJdbcTemplate npJdbcTemplate;

    public ImmutableList<AuthorBo> findAll() {
        return npJdbcTemplate.query(SQL_FIND_ALL_AUTHORS, (rs, rowNum)-> {
            return AuthorBo.of().authorId(rs.getInt(1))
                    .fullName(rs.getString(2))
                    .dob(rs.getDate(3).toLocalDate())
                    .gender(rs.getString(4))
                    .contactNo(rs.getString(5))
                    .emailAddress(rs.getString(6)).build();
        }).stream().collect(toImmutableList());
    }

    public long countByContactNo(String contactNo){
        return npJdbcTemplate.queryForObject(SQL_CNT_AUTHORS_BY_CONTACT_NO, Collections.singletonMap("contactNo", contactNo), Long.class);
    }

    public long countByEmailAddress(String emailAddress){
        return npJdbcTemplate.queryForObject(SQL_CNT_AUTHORS_BY_EMAIL_ADDRESS, Collections.singletonMap("emailAddress", emailAddress), Long.class);
    }

    public void saveAuthor(final AuthorBo authorBo){
        final SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(authorBo);
        npJdbcTemplate.update(SQL_SAVE_AUTHOR, parameterSource);
    }
}
