package webservice;

import models.Product;

import java.util.Date;
import java.util.List;


public class ProductWebService {

    public Double sellingPrice(Double price) {
           return  price*1.5;
    }

    public Product getProduct(Integer code) {
        return new Product(code, "Table", 300.00, new Date());
    }

    public List<Product> productList() {
        return List.of(
                new Product(1, "Table", 300.00, new Date()),
                new Product(2, "Pen", 3.00, new Date()),
                new Product(3, "cheese", 30.00, new Date()),
                new Product(4, "Bread", 6.00, new Date())
        );
    }
}
