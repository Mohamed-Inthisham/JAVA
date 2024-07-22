package IfStatement;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
/*    1-    In a banking application, how would you write a condition to check if a user can withdraw a specified amount of money from their account, given their current balance?


        int currentBalance=50000;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        int withdraw=scanner.nextInt();

        if(currentBalance > withdraw){
            System.out.println("Withdraw money: "+withdraw);
            System.out.println("Updated Balance : "+(currentBalance-withdraw));

        }else
            System.out.println("insufficient money to withdraw");

 */
        /* 2- In an e-commerce application, you need to implement discount logic based on the following criteria:

            If the total purchase amount exceeds $100:
            Check if the user is a premium member:
            If the user is a premium member, apply a 15% discount.
            If the user is not a premium member, apply a 10% discount.
            If the total purchase amount is $100 or less:
            Check if the user has a discount coupon:
            If the user has a discount coupon, apply a 5% discount.
            If the user does not have a discount coupon, apply no discount.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        double purchase = scanner.nextDouble();
        double discount = 0.0;

        if (purchase >= 100) {
            System.out.println("are u a premium member?");
            boolean checkPremium = scanner.next().equalsIgnoreCase("yes");
            if (checkPremium) {
                discount = purchase * 0.15;
                System.out.println("Premium member discount : " + discount);
                System.out.println("total after discount: " + (purchase - discount));
            } else {
                discount = purchase * 0.10;
                System.out.println("discount for 100 > : " + discount);
                System.out.println("total after discount: " + (purchase - discount));
            }
        } else if (purchase < 100) {
            System.out.println("do u have coupon?");
            boolean checkCoupon = scanner.next().equalsIgnoreCase("yes");
            if (checkCoupon) {
                discount = purchase * 0.05;
                System.out.println("coupon code discount : " + discount);
                System.out.println("total after discount: " + (purchase - discount));
            } else {
                System.out.println("not eligible for discount");
                System.out.println("total amount : " + purchase);
            }

        }
    }
}
