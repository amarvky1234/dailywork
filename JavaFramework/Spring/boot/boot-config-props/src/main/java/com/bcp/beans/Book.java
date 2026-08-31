package com.bcp.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    String isbn;
    String title;
    String author;
    String publisher;
    LocalDate publishedDate;
    String language;
    double price;
}
