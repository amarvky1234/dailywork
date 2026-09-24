package com.bootjdbc;

import com.bootjdbc.bo.AuthorBo;
import com.bootjdbc.dao.AuthorDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class BootJdbcApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootJdbcApplication.class, args);
        AuthorDao authorDao = applicationContext.getBean(AuthorDao.class);

        int r = authorDao.saveAuthor(AuthorBo.of()
                .authorId(123)
                .fullName("Priya")
                .dob(LocalDate.now().minusDays(3456))
                .gender("female")
                .emailAddress("priya@mail.com")
                .contactNo("8756897634").build());
        System.out.println("record saved :"+r);

        authorDao.findAll().forEach(System.out::println);

        System.exit(SpringApplication.exit(applicationContext));
    }
}
