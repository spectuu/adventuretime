package com.spectu.game;

import java.util.Scanner;

public class ScannerWrapper {

    private Scanner scanner;

    public ScannerWrapper() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt() {

        int scannerInt = scanner.nextInt();
        getString();
        return scannerInt;

    }

    public String getString() {

        return scanner.nextLine();

    }

    public boolean getBoolean() {

        boolean scannerBoolean = scanner.nextBoolean();
        getString();
        return scannerBoolean;
    }

}
