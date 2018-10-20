package com.homework.model;

public class Currency {
    private String currencyName;
    private double multiplicand;
    private String code;
    private double rate;

    public Currency(String code, String currencyName, double rate, double multiplicand) {
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

    public double getMultiplicand() {
        return multiplicand;
    }

    public double getRate() {
        return rate;
    }

    public void setMultiplicand(float multiplicand) {
        this.multiplicand = multiplicand;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}
