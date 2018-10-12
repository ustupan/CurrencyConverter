package com.homework.model;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "tabela_kursow")
public class Currencies {
    @XmlElement(name = "pozycja")
    private List<Currency> currencies = new ArrayList<>();

    Currencies() {}

    List<Currency> getCurrencies() {
        return currencies;
    }
}
