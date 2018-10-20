package com.homework;
import com.homework.model.*;
import com.homework.calculator.Calculator;
import com.homework.controller.*;
import com.homework.view.UserInterface;

public class Main {

    public static void main(String[] args) {
        CurrRepository currRepository = new CurrRepository();
        ControllerInterface currController;
        ControllerInterface digController;
        currController = new CurrController(currRepository);
        digController = new DigitController();
        UserInterface userInterface = new UserInterface(currController, digController);
        boolean success = false;
        while (!success) {
            try {
                userInterface.run();
                success = true;
                Calculator calculator = new Calculator();
                String result = calculator.calculate(userInterface.getAmount(),
                        currRepository.getCurrencyByCode(userInterface.getInputCode()),
                        currRepository.getCurrencyByCode(userInterface.getOutputCode()));
                userInterface.result(result);
            } catch (Exception e) {
                System.out.println("Invalid data");
            }
        }
    }
    }

