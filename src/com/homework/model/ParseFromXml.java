package com.homework.model;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class ParseFromXml implements ParseData {
    private StringBuffer response;

    @Override
    public void parse() {
        try {
        WebClient webClient = new WebClient();
        response = webClient.requireData("https://www.nbp.pl/kursy/xml/LastA.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new InputSource(new StringReader(response.toString())));
        //tutaj jeszcze cos zmienic
        NodeList errNodes = doc.getElementsByTagName("pozycja");
        if (errNodes.getLength() > 0) {
            Element err = (Element) errNodes.item(0);
            System.out.println("nazwa_waluty" + err.getElementsByTagName("nazwa_waluty").item(0).getTextContent());
        }
        else {
            System.out.println("Jakis error");
        }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
