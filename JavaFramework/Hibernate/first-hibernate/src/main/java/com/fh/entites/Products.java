package com.fh.entites;

import java.io.Serializable;
import java.util.Objects;

public class Products implements Serializable {
    private int productNo;
    private String productName;
    private String description;
    private String manufacturerName;
    private String categoryName;
    private double price;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
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
        if (!(o instanceof Products products)) return false;
        return getProductNo() == products.getProductNo() && Double.compare(getPrice(), products.getPrice()) == 0 && Objects.equals(getProductName(), products.getProductName()) && Objects.equals(getDescription(), products.getDescription()) && Objects.equals(getManufacturerName(), products.getManufacturerName()) && Objects.equals(getCategoryName(), products.getCategoryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductNo(), getProductName(), getDescription(), getManufacturerName(), getCategoryName(), getPrice());
    }

    @Override
    public String toString() {
        return "Products{" +
                "productNo=" + productNo +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }
}
