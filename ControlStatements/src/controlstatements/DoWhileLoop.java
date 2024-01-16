/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlstatements;

/**
 *
 * @author isthi
 */
public class DoWhileLoop {
    public static void main(String[]args){
        
        // do while loop also have 4 parts
        // always run atleast once
        
        int start=1;  // start
        
        do{     // {loop body}
            System.out.println("Do while loop Running");
            start++;  // increment/decrement
        }while(start<5); //(condition)
        
        System.out.println(start);
    }
    
}
