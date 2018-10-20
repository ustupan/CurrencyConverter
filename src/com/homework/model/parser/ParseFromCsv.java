package com.homework.model.parser;

import com.homework.model.Currency;
import com.homework.model.webConnection.WebClient;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.Map;
import java.util.HashMap;

public class ParseFromCsv implements ParseData {
    // miejsce na implementacje parsowania z csv...
    private Map<String, Currency> currMap = new HashMap<>();
    private WebClient webClient;

    public ParseFromCsv(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Map<String, Currency> parse() throws Exception{
        StringBuffer response;
        try {
            response = webClient.requireData();
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(response.toString())));
            NodeList errNodes = doc.getElementsByTagName("pozycja");

            for(int i=0; i< errNodes.getLength(); i++){
                Element err = (Element) errNodes.item(i);
                String name = err.getElementsByTagName("nazwa_waluty").item(0).getTextContent();
                String code = err.getElementsByTagName("kod_waluty").item(0).getTextContent();
                String tempMultiplicand = err.getElementsByTagName("przelicznik").item(0).getTextContent();
                String tempRate = err.getElementsByTagName("kurs_sredni").item(0).getTextContent();
                double rate = Double.parseDouble(tempRate.replace(",", "."));
                double multiplicand = Double.parseDouble(tempMultiplicand.replace(",", "."));
                currMap.put(code, new Currency(code, name, rate, multiplicand));
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return currMap;
    }

}
