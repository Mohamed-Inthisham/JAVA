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
        
        //05
         String s="100";
         int value=Integer.parseInt(s);
         System.out.println(value);
         
         double value1=Double.parseDouble(s);
         System.out.println(value1);
         
         short value3=Short.parseShort(s);
         System.out.println(value3);
         
         //06
         char letter='V';
         System.out.println((int) letter);
         
         //08
         int Mark=67;
         
         if(Mark < 0){
             System.out.println("Negative number not valid");
         }else if(Mark > 0 && Mark <= 44){
             System.out.println("Failed");
         }else if (Mark >=45 && Mark <=54){
             System.out.println("PASSED: C");
         }else if(Mark >=55 && Mark <=64){
             System.out.println("PASSED: C+");
         }else if(Mark >=65 && Mark <= 74){
             System.out.println("PASSED: B");
         }else if(Mark >=75 && Mark <= 79){
             System.out.println("PASSED: B+");
         }else if(Mark >=80 && Mark <=100){
             System.out.println("PASSED: A");
         }else{
             System.out.println("Invalid number");
         }
         
         //09
         
         int Month=1;
         
         switch(Month){
             case 1 :
                 System.out.println("January");
                 break;
             case 2 :
                 System.out.println("February");
                 break;
             case 3 :
                 System.out.println("March");
                 break;
             case 4 :
                 System.out.println("April");
                 break;
             case 5 :
                 System.out.println("May");
                 break;
             case 6 :
                 System.out.println("June");
                 break;
             case 7 :
                 System.out.println("July");
                 break;
             case 8 :
                 System.out.println("August");
                 break;
             case 9 :
                 System.out.println("September");
                 break;
             case 10 :
                 System.out.println("October");
                 break;
             case 11 :
                 System.out.println("November");
                 break;
             case 12 :
                 System.out.println("December");
                 break;
             default :
                 System.out.println("Invalid Input");
           
         }
         
         //10
         
         int x1=99;
         if(x1 == 0){
             System.out.println("x1 is Zero");
         }else{
             if(x1 > 0){
                 System.out.println("x1 is Positive");
             }else{
                 System.out.println("x1 is negative");
             }
         }
         
         //11
         
         for(int i=1 ; i<=5 ;i++){
             int num=10*i;
             System.out.println("No "+i+": "+num);
         }
         
         //12
         
         int num1=1;
         while(num1<=10){
             if(num1==3 || num1==7 || num1==8 || num1==9 ){
                 num1++;
                 continue;   
             }
             System.out.println(num1);
             num1++;
             
         }
    }
}
