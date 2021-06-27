package com.spectu.game;

import java.util.Scanner;

public class ScannerWrapper {

    private Scanner scanner;

    public ScannerWrapper() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt() {

        try {

            int scannerInt = scanner.nextInt();
            getString();
            return scannerInt;

        } catch (Exception e) {

            System.out.println("El valor introducido es incorrecto!");

            scanner.nextLine();
            return -1;

        }

    }

    public String getString() {
        try {

            return scanner.nextLine();
        } catch (Exception e) {
            return "El valor introducido es incorrecto!";
        }
    }

    public boolean getBoolean() {

        boolean scannerBoolean = scanner.nextBoolean();
        getString();
        return scannerBoolean;
    }

}
