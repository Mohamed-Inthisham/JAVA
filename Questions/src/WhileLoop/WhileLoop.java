package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[]args){

//1- Sum of Numbers: Write a program that sums all integers from 1 to a given number n (inclusive). Use a while loop to calculate the sum.
//
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=scanner.nextInt();
//
//        int sum=0;
//        int current=1;
//
//        while(current <=n){
//            sum += current;
//            current++;
//            System.out.println(sum);
//        }
//        System.out.println(sum);


//        Countdown
//        int countdown=5;
//        while(countdown>=1){
//            System.out.println(countdown);
//            countdown--;
//        }
//        System.out.println("Happy New Year");


        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the dice number");
        int dice=scanner.nextInt();

        if(dice<1 || dice>6){
            System.out.println("error");
        }else {
            while (dice <= 6) {
                if (dice < 6) {
                    System.out.println("not yatzy");
                } else {
                    System.out.println("yatzyyyyyyyyyyy");
                }
                dice++;
            }
        }
    }
}
