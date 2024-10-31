package models;

import java.util.Date;

public class Product {

    private Integer code;

    private String name;

    private Double price;

    private Date dateCreation;

    public Product() {
    }

    public Product(Integer code, String name, Double price, Date dateCreation) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.dateCreation = dateCreation;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
