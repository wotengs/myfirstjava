package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to get the largest; ");
        float number = input.nextInt();
        float number1 = input.nextInt();

        if (number>number1)
        { System.out.printf("%s", "The largest is:\n" );
        System.out.printf("%f", number);
        }
        else{
            System.out.printf("%s", "The largest is:\n");
            System.out.printf("%f", number1);
        }

    }
}
