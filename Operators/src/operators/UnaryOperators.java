/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author isthi
 */
public class UnaryOperators {
    public static void main(String[]args){
        
        // POSTFIX  i++ , i--
        
        // example 01
        int chinaLoan=20;
        int lanka=chinaLoan; // before postfix to chinaLoan
        System.out.println(lanka);
        System.out.println(chinaLoan); //chinaLoan value
        System.out.println("------------------------");
        int lankapay=chinaLoan++; // after adding postfix chinaLoan
        System.out.println(lankapay);
        System.out.println(chinaLoan); //chinaLoan value
        
        // example 02
        
        int x=10;
        
        int ans1=x++; // ans1=10  | x=11 (1st x is assign to ans value after that increment the x value)
        System.out.println(ans1);
        int ans2=x++; // ans2=11  | x=12
        System.out.println(ans2);
        int ans3=x++; // ans3=12  | x=13
        System.out.println(ans3);
        int ans4=x++; // ans4=13  | x=14
        System.out.println(ans4);
        
        System.out.println(x); // x=14
        
        
    }
}
