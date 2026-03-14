package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();

        System.out.println("Carregando o serviço de estoque de vinhos...");
        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        System.out.println("Serviço de estoque de vinhos publicado com sucesso!");

        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        System.out.println("Carregando o serviço de alerta de vinhos...");
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);
        System.out.println("Serviço de alerta de vinhos publicado com sucesso!");
    }
}
