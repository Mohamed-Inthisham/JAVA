/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlstatements;

/**
 *
 * @author isthi
 */
public class IfStatement {
     public static void main(String[]args){

        // if 

        int age = 20;
        if(age>=18){
            System.out.println("Adult");
        }

        // if else

        int age1=12;
        if(age1>=18){
            System.out.println("Adult");
        }else{
            System.out.println("child");
        }

        //if else if

        int model=5;
        if(model == 1){
            System.out.println("Nokia");
        }else if(model==2){
            System.out.println("Samsung");
        }else if(model==3){
            System.out.println("Apple");
        }else{
            System.out.println("invalid input");
        }

        // nested if

        int age3=25;
        if(age3>=18){
            if(age3>=100){
                System.out.println("invalid age");
            }else{
                System.out.println("adult");
            }
        }else if(age3<18){
            if(age3<=0){
                System.out.println("invalid age");
            }else{
                System.out.println("child");
            }
        }

        // we can use logical operators inside the if 

        int age5=45;
        if(age5>0 && age5<=100 ){
            System.out.println("valid age");
        }

        // checking string values using .equals
        String brand="nokia";
        if(brand.equals("nokia")){
            System.out.println("Welcome to Nokia");
        }else{
            System.out.println("shutdown");
        }
    }
    
}
