package com.madushan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        to take the roman number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number : ");
        String romanNumber = scanner.nextLine();

//        split the entire string
        String[] SplitCharacter = romanNumber.split("", romanNumber.length());

//        printing the split array
        /*for(String j: SplitCharacter) {
            System.out.print(j);
        }*/
        int I_value = 0;
        int V_Value = 0;
        int X_Value = 0;
        int L_Value = 0;
        int C_Value = 0;
        int D_Value = 0;
        int M_Value = 0;

        for(int i=0; i < SplitCharacter.length; i++) {
            if (SplitCharacter[i].equals("I")) {
                I_value +=1;
            } else if (SplitCharacter[i].equals("V")) {
                V_Value +=5;
            } else if (SplitCharacter[i].equals("X")) {
                V_Value +=10;
            }else if (SplitCharacter[i].equals("L")) {
                V_Value +=50;
            }else if (SplitCharacter[i].equals("C")) {
                V_Value +=100;
            }else if (SplitCharacter[i].equals("D")) {
                V_Value +=500;
            }else if (SplitCharacter[i].equals("M")) {
                V_Value +=1000;
            }
        }
        int romanToInteger = I_value + V_Value + X_Value + L_Value + C_Value + D_Value + M_Value;
        System.out.println("Roman " + romanNumber + " in integer is : " + romanToInteger);
        }
}
