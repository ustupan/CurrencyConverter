package com.homework.model;

import com.homework.model.parser.ParseData;
import com.homework.model.parser.ParseFromCsv;
import com.homework.model.parser.ParseFromXml;
import com.homework.model.webConnection.WebClient;

import java.util.Map;

public class CurrRepository {
    private Map<String, Currency> currMap;
    private WebClient webClient;

    public CurrRepository() {
        update();
    }

    private void update(){
        try {
            webClient = new WebClient("https://www.nbp.pl/kursy/xml/LastA.xml");
        }catch (Exception e){
            //ParseData parseData = new ParseFromCsv(currencies.csv);
            System.out.println("Parsing from CSV");
            //parseData = new ParseFromCsv(data.csv);
        }
        ParseData parseData = new ParseFromXml(webClient);
        try {
            currMap = parseData.parse();
        } catch (Exception e) {
            System.out.println("Fatal error unable to read data...");
        }
    }
    public Currency getCurrencyByCode(String code){
        return currMap.get(code);
    }
    public Map<String, Currency> getAllCurrency(){
        return currMap;
    }

}
