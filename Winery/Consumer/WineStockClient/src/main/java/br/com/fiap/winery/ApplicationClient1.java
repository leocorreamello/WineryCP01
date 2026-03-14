package br.com.fiap.winery;

import br.com.fiap.winery.stubclasses.WineStockService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient1 {
    public static void main(String[] args) throws MalformedURLException {

        final String WSDL = "http://localhost:8085/WineStockService?wsdl";
        final String TARGETNAMESPACE = "http://winery.fiap.com.br/";
        final String LOCALPART = "WineStockServiceImplementationService";


        URL url = new URL(WSDL);
        QName qName = new QName(TARGETNAMESPACE, LOCALPART);
        Service service = Service.create(url, qName);

        WineStockService wineStockService = service.getPort(WineStockService.class);

        String menu = wineStockService.getMenu();
        System.out.println("Menu do dia: " + menu);
    }
}
