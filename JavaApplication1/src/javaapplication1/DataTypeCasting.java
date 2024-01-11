/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author isthi
 */
public class DataTypeCasting {
   public static void main(String[] args){
       /* there two types of TypeCasting
        1) Widening - Automatic typ casting 
       small data types can put it into big data types */
       byte a=127;
       short b=a;
       System.out.println(b);
       
       int c=2000;
       double d=c;
       System.out.println(d);
       
       // 2) Narrowing -  Manual type casting 
       // when it comes to other side that means big data types put in to small data types
       // we have to convert that into same data type manually
       
      int k= (int) 78.456d;
      System.out.println(k);
      
      short j=(short)15879646;
      System.out.println(j);
      
   }
    
}
