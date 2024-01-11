/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author inthi
 */
public class DataTypes {
    
    public static void main(String[]args){
        
        /*there are two types of DataTypes
        1)Premitive data Types
        2)non-Primitive data types
        ---------------------------------------
        
        1)primitive data types
        ``1.1) Integers
                -byte (-128 to 127)
                -short (-32768 to 32767)
                -int (-2,147,483,648 to 2,147,483,647)
                -long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
          1.2) Floating points
                -float ( up to 7 decimal digits)
                -double ( up to 16 decimal digits)
          1.3) Characters
                -char ( a to z)
          1.4) True/False
                -bolean( true ,false)
        
        2)non-primitive data types(objects)
            2.1)Strings
            2.2)Array
            2.3)List
            and many more 
        */
        
        byte value=127;
        short value1=5000;
        int value2=49000;
        long value3=4444444444444444444L; // if L or l is not there it gives an error.have to specificaly say it is a Long value
        
        float value4=21.06F; //if F or f is not there it gives an error.have to specificaly say it is a float value
        double value5=533.06415;
        
        char letter='a';
        
        boolean status=true;
        
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(letter);
        System.out.println(status);
        
        
    }
    
}
