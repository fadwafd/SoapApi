package org.soap.server;

import jakarta.xml.ws.Endpoint;
import org.soap.webservice.ProductWebService;

public class ServerWS {

    public static void main(String[] args) {
        String url = "http://localhost:9090/ProductService";
        // je publie via l'url que je viens de créer et de spécifier mon webservice
        // On a donnée l'accéssiblité a ce webService
        Endpoint.publish(url, new ProductWebService());
        // Confirmer qu'on a déploiyé ce webService
        System.out.println(url + "deployed");

    }
}
