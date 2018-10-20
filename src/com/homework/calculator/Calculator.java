package com.homework.calculator;
import com.homework.model.*;


public class Calculator {

    public String calculate(double amount, Currency inputCurrency, Currency outputCurrency){
        double value;
        value = (amount * inputCurrency.getRate()/inputCurrency.getMultiplicand()
                / outputCurrency.getRate() * outputCurrency.getMultiplicand());
        return  amount + inputCurrency.getCode() + " = " + value + outputCurrency.getCode() + '\n';
    }
}

