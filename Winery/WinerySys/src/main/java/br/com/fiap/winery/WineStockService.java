package br.com.fiap.winery;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface WineStockService {

    @WebMethod
    String getMenu();

    @WebMethod
    String placeOrder(String name, int quantity);


}
