package com.homework.model;
import java.util.Map;

public class CurrRepository {

    private Map<String,Currency> currencies;

    public CurrRepository() {
       /*wrzucanie walut do mapy*/
    }

    public Currency getCurrencyByCode(String code){
        return currencies.get(code);
    }

    public Map<String,Currency> getAllCurrencies(){
        return currencies;
    }

}
