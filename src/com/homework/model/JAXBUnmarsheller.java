package com.homework.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.URL;

public class JAXBUnmarsheller {
    public static Object unmarshall(Class objectClass, URL url) throws JAXBException{
        Currencies currencies = new Currencies();
        // Creating an Unmarshaller
        JAXBContext jaxbCtxt = JAXBContext.newInstance(objectClass);
        Unmarshaller jaxbUnmarshaller = jaxbCtxt.createUnmarshaller();
        //Converting XML to java object using JAXB unmarshal API.
        currencies = (Currencies) jaxbUnmarshaller.unmarshal(url);
        return currencies.getCurrencies();
    }
}
