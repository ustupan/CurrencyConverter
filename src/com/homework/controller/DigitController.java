package com.homework.controller;

public class DigitController implements ControllerInterface {

    @Override
    public void check(String x) throws Exception{
        try {
            Double.parseDouble(x.replace(",", "."));
        }
        catch (Exception e){
            throw new Exception("Wrong digit read.");
        }
    }
}
