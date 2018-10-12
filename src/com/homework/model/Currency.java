package com.homework.model;

public class Currency {
    private String code;
    private String currencyName;
    private float rate;
    private float multiplicand;

    public Currency(String code, String currencyName, float rate, float multiplicand) {
        this.code = code;
        this.currencyName = currencyName;
        this.rate = rate;
        this.multiplicand = multiplicand;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCode() {
        return code;
    }

    public float getMultiplicand() {
        return multiplicand;
    }

    public float getRate() {
        return rate;
    }

    public void setMultiplicand(float multiplicand) {
        this.multiplicand = multiplicand;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
