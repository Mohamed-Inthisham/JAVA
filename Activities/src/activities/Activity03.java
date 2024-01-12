/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activities;

/**
 *
 * @author isthi
 */
public class Activity03 {
    public static void main(String[]args){
        //02
        int x=10;
        double y=x;
        double z=45.7;
        int k = (int) z;
        
        System.out.println(y);
        System.out.println(z);
         System.out.println("--------------------");
        
        //03
        String welcome="Welcome to ";
        String name= "Evotech education Institute     ";
        String myStr1="";
        String myStr2="hello";
        String myStr3="hello";
        
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); // trim is use for remove the unwanted leading and trailing spaces
        char result=name.charAt(3);
        System.out.println(result);
        
        System.out.println(welcome.concat(name)); // concat is use for join two Strings
        System.out.println(name.contains("education")); // used to check whether a particular sequence of characters (substring) is present within the given string
        System.out.println(welcome.contains("srilanka"));
        System.out.println(name.indexOf("Institute"));
        System.out.println(name.length());
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr2.equals(myStr3));
        System.out.println(myStr1.equals(myStr2));
    }
}
