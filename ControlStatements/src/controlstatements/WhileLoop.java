/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlstatements;

/**
 *
 * @author isthi
 */
public class WhileLoop {
    public static void main(String[]args){
        
        // while loop also have 4 parts
        
        int start=1; // start
        
        while(start<5){ // (condition)
            System.out.println("JAVA"); // {loop body}
            start++; // before the } increment and decrement
        }
        System.out.println(start); // checking the last value of start
    }
    
}
