package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        /* 1- Write a Java program that takes an integer input and uses a ternary operator to check if it is positive or non-positive (zero or negative). Print the result accordingly.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a integer number");
        int number=scanner.nextInt();

        String result =(number > 0) ? "positive" : "non-positive";
        System.out.println(result);

         */

        /*
       2- Write a Java program that takes two integers as input and uses a ternary operator to determine and print the maximum of the two.


        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1=scanner.nextInt();
        System.out.println("enter the 2nd number");
        int num2=scanner.nextInt();
        String max=(num1 == num2) ? "numbers are equal":(num1>num2)?"max number is"+num1:"max number is"+num2;
        System.out.println(max);

         */

        /*
        3- Write a Java program that uses a ternary operator to check if a given integer is even or odd and prints the result.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();

        String result=(num %2 ==0)? "even number" : "odd number";
        System.out.println(result);

         */

        /*
        4- Write a Java program that uses a ternary operator to classify a person's age into categories: "Child" (age < 13), "Teenager" (age 13-19), or "Adult" (age 20 or older).


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age");
        int age=scanner.nextInt();

        String result=(age < 13)? "Child":(age >= 13 && age <= 19)?"Teenager":"Adult";
        System.out.println(result);

         */

        /*
        5- Write a Java program that uses a ternary operator to classify a student's grade into categories:
"Excellent" for grades 90 and above,
"Good" for grades between 70 and 89,
"Average" for grades between 50 and 69,
"Fail" for grades below 50.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade = scanner.nextInt();

        String result = (grade < 0 || grade > 100) ? "invalid input" :
                (grade < 50 ) ? "Fail" :
                        (grade <70) ? "Average" :
                                (grade<90) ? "Good" : "Excellent";
        System.out.println(result);
    }
}
