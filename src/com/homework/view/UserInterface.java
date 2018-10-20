package com.homework.view;
import com.homework.controller.*;

import java.util.Scanner;

public class UserInterface {
    private ControllerInterface currController;
    private ControllerInterface digController;
    private String inputCode;
    private String outputCode;
    private Double amount;

    public UserInterface(ControllerInterface currController, ControllerInterface digController) {
        this.currController = currController;
        this.digController = digController;
    }

    public String getInputCode() {
        return inputCode;
    }

    public String getOutputCode() {
        return outputCode;
    }

    public Double getAmount() {
        return amount;
    }

    private void scannInputValue() throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj kod waluty wejsciwej: ");
        inputCode = read.nextLine();
        currController.check(inputCode);
    }
    private void scannOutputValue() throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj kod waluty wyjsciowej: ");
        outputCode = read.nextLine();
        currController.check(outputCode);
    }
    private void scanAmount() throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj kwote jaka chcesz zmienic: ");
        String tempAmount = read.nextLine();
        digController.check(tempAmount);
        amount = Double.parseDouble(tempAmount.replace(",", "."));
    }
    public void result(String x){
        System.out.println(x);
    }

    public void run() throws Exception {
        scannInputValue();
        scannOutputValue();
        scanAmount();
    }

}
