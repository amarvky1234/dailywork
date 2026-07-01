package com.the.entitites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Books implements Serializable {
    private int isbnNo;
    private String title;
    private String auothorName;
    private LocalDate publishedDate;
    private String publisherName;
    private double price;

    public int getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuothorName() {
        return auothorName;
    }

    public void setAuothorName(String auothorName) {
        this.auothorName = auothorName;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books books)) return false;
        return getIsbnNo() == books.getIsbnNo() && Double.compare(getPrice(), books.getPrice()) == 0 && Objects.equals(getTitle(), books.getTitle()) && Objects.equals(getAuothorName(), books.getAuothorName()) && Objects.equals(getPublishedDate(), books.getPublishedDate()) && Objects.equals(getPublisherName(), books.getPublisherName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbnNo(), getTitle(), getAuothorName(), getPublishedDate(), getPublisherName(), getPrice());
    }

    @Override
    public String toString() {
        return "Books{" +
                "isbnNo=" + isbnNo +
                ", title='" + title + '\'' +
                ", auothorName='" + auothorName + '\'' +
                ", publishedDate=" + publishedDate +
                ", publisherName='" + publisherName + '\'' +
                ", price=" + price +
                '}';
    }
}
