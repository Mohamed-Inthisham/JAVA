/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author isthi
 */
public class TernaryOperators03 {
    
    public static void main(String[]args){
        // we can check small conditions using ternary operator
        // ? : (? true : false)
        
        int age= 20;
        String ans =(age >= 18)? "Adult" : "Child";
        System.out.println(ans);
        
        // we can check multiple conditions inside the ternary operator
        // this is called Nested ternary Operator
        
        int age1= 10;
        String ans1 =(age1 >= 18)?((age1>=100)?"invalid age":"adult"):((age1<=0)?"invalid age" :"child");
        System.out.println(ans1);
    }
}
