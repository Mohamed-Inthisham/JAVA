/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author isthi
 */
public class ArithmaticOperators {
    public static void main(String[]args){
        // Addition +
        int num1=100;
        int num2=20;
        
        int sum= num1 + num2; // method 01
        System.out.println(sum);
        
        System.out.println(10+15); // method 02
        
        int ans=50+50; // method 03
        System.out.println(ans);
        
        int num3=50;
        num3 += 100; // method 04
        
        System.out.println(num1 + num2); // method 05
        
        // Subtraction -
        System.out.println(num1 - num2);
        
        // Multiplication *
        System.out.println(num1 * num2);
        
        // Division /
        System.out.println(num1 / num2);
        
        // Modulus %
        System.out.println(num1 % num2);
    }
    
}
