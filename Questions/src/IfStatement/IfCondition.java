package IfStatement;

import java.util.Scanner;

public class IfCondition {
    public static void main(String []args){
//        In a banking application, how would you write a condition to check if a user can withdraw a specified amount of money from their account, given their current balance?


        int currentBalance=50000;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        int withdraw=scanner.nextInt();

        if(currentBalance > withdraw){
            System.out.println("Withdraw money: "+withdraw);
            System.out.println("Updated Balance : "+(currentBalance-withdraw));

        }else
            System.out.println("insufficient money to withdraw");

    }
}
