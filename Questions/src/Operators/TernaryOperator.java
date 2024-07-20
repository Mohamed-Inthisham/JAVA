package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[]args){
        /* 1- Write a Java program that takes an integer input and uses a ternary operator to check if it is positive or non-positive (zero or negative). Print the result accordingly.
         */
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a integer number");
        int number=scanner.nextInt();

        String result =(number > 0) ? "positive" : "non-positive";
        System.out.println(result);

    }
}
