package com.madushan;

import java.util.Scanner;

public class Main {

    private static final char I = 1;
    private static final char V = 5;
    private static final char X = 10;
    private static final char L = 50;
    private static final char C = 100;
    private static final char D = 500;
    private static final char M = 1000;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roman Numeral :");
        String Number = scanner.nextLine();

//      creating a String array
        String[] characters = new String[Number.length()];

//      create a int array
        int[] arr = new int[Number.length()];
        characters = (Number.split("", Number.length()));

        char roman = 0;
        switch (roman) {
            case I:
//                convert String array to int array
                for(int i=0; i < Number.length(); i++) {
                    arr[i] = Integer.parseInt(characters[i]);
                }
                break;
            case V:

                break;
            case X:

                break;
            case L:

                break;
            case C:

                break;
            case D:

                break;
            case M:

                break;
        }
        System.out.println(arr[0]);

    }

}
