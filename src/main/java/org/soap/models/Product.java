package org.soap.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    private Integer code;

    private String name;

    private Double price;

    private Date dateCreation;

    public Product() {
    }

    public Product(Integer code, String table, String s, Date dateCreation) {
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

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
