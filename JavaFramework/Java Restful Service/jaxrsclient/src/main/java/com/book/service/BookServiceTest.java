package com.book.service;

public class BookServiceTest {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        double price = bookService.getBookPrice("isbn3943");
        System.out.println("price : "+price);
    }
}
