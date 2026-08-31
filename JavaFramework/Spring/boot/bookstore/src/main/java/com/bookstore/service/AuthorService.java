package com.bookstore.service;

import com.bookstore.bo.AuthorBo;
import com.bookstore.dao.AuthorDao;
import com.bookstore.dto.AuthorDto;
import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.google.common.collect.ImmutableList.toImmutableList;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorDao authorDao;

    @Transactional(readOnly = true)
    public ImmutableList<AuthorDto> getAuthors() {
        return authorDao.findAll().stream().map(bo -> {
            return AuthorDto.of().authorId(bo.getAuthorId())
                    .fullName(bo.getFullName())
                    .dob(bo.getDob())
                    .gender(bo.getGender())
                    .contactNo(bo.getContactNo())
                    .emailAddress(bo.getEmailAddress()).build();
        }).collect(toImmutableList());
    }

    @Transactional(readOnly = true)
    public long countByContactNo(final String contactNo){
        return authorDao.countByContactNo(contactNo);
    }

    @Transactional(readOnly = true)
    public long countByEmailAddress(final String emailAddress){
        return authorDao.countByEmailAddress(emailAddress);
    }

    @Transactional(readOnly = false)
    public void saveAuthor(final AuthorDto authorDto){
        final AuthorBo bo = AuthorBo.of().authorId(authorDto.getAuthorId())
                .fullName(authorDto.getFullName())
                .dob(authorDto.getDob())
                .gender(authorDto.getGender())
                .contactNo(authorDto.getContactNo())
                .emailAddress(authorDto.getEmailAddress()).build();
        authorDao.saveAuthor(bo);
    }
}
