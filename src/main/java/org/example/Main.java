package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String name = terminalInput.nextLine();
        System.out.println("Hello world from " + name);
    }
}