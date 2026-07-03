package com.ct.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Builder(builderMethodName = "of")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "books")
@EqualsAndHashCode(exclude = "books")
@Entity
@Table(name = "author")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int authorId;
    @Column(name = "full_nm")
    private String fullName;
    private LocalDate dob;
    private String gender;
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;
}

