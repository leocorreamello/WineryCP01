package br.com.fiap.winery;

import jakarta.jws.WebService;

import java.util.Arrays;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{

    @Override
    public String getMenu() {
        String[] vinhos = {"Uva Cabernet Sauvignon", "Uva Merlot", "Uva Chardonnay", "Uva Pinot Noir"};
        return Arrays.toString(vinhos);
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido recebido: " + quantity + " garrafas de " + name;
    }
}
