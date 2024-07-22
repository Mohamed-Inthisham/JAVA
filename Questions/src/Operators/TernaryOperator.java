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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade = scanner.nextInt();

        String result = (grade < 0 || grade > 100) ? "invalid input" :
                (grade < 50 ) ? "Fail" :
                        (grade <70) ? "Average" :
                                (grade<90) ? "Good" : "Excellent";
        System.out.println(result);

         */

        /*
        6- Write a Java program that uses a ternary operator to calculate and print the discounted price of an item. If the original price is greater than $100, apply a 10% discount; otherwise, apply a 5% discount.


        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the item price");
        float originalPrice=scanner.nextFloat();

        float discount=(originalPrice > 100)?originalPrice*0.10f:originalPrice*0.5f;
        System.out.println("Discounted Price : "+discount);
        System.out.println("Total After the Discount  : "+(originalPrice-discount));

         */

        /*
        7- Write a Java program that takes two strings as input and uses a ternary operator to determine and print which string is longer, or if they are of equal length.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        String result = (str1.length() > str2.length()) ? "The first string is longer." :
                        (str1.length() < str2.length()) ? "The second string is longer." :
                        "Both strings are of equal length.";

        System.out.println(result);

         */

        /*
        Write a Java program that uses a ternary operator to check if a given password is strong or weak. Consider a password strong if it is at least 8 characters long, otherwise, it is weak.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password:");
        String password = scanner.nextLine();

        String result = (password.length() >= 8) ? "Strong password" : "Weak password";

        System.out.println(result);
         */
    }
}
