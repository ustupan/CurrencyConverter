package com.homework.controller;
import com.homework.model.*;


public class Calculator {
    private Currencies currencyRepository;

    public Calculator(Currencies currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public double calculate(double amount, Currency inputCurrency, Currency outputCurrency){
        //algorytm
        return 0;
    }
}
