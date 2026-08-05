package com.stereotype.primitiveinjection.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("classpath:com/stereotype/primtiveinjection/annotation/app-values.properties")
public class Book {
    @Value("${book.isbn}")
    private String isbn;
    @Value("${book.title}")
    private String title;
    @Value("${book.author}")
    private String author;
    @Value("${book.price}")
    private double price;
}
