package org.soap.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.soap.models.Product;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "ProductWS")
public class ProductWebService {

    @WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name = "Price") Double price) {
        return price*1.5;
    }

    @WebMethod(operationName = "getProduct")
    public Product getProduct(@WebParam(name = "code")Integer code) {

        return new Product(code, "Table","300.00",new Date());
    }

    @WebMethod(operationName = "productList")
    public List<Product> productList() {
        return List.of(
                new Product(1, "table", "300.00", new Date()),
                new Product(2, "Pen", "3.00", new Date()),
                new Product(3, "cheese", "30.00", new Date()),
                new Product(4, "bread", "6.00", new Date())
        );
    }

}
