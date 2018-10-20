package com.homework.controller;
import com.homework.model.*;

public class CurrController implements ControllerInterface {
    private CurrRepository curr;

    public CurrController(CurrRepository curr) {
        this.curr = curr;
    }

    @Override
    public void check(String x) throws Exception{
        if(curr.getCurrencyByCode(x) == null){
            throw new Exception("Illegal Currency.");
        }
    }
}

