package Variable;


//Create a class called MathOperations with the following:
//        A static method add(int a, int b) that returns the sum of two numbers.
//        A non-static method multiply(int a, int b) that returns the product of two
//numbers.
//2. In the main method, demonstrate calling the static method without creating an instance
//and calling the non-static method by creating an instance.

public class MathOperations {

    public static int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[]args){
       int sum= MathOperations.add(20,30);

        MathOperations mathOperations=new MathOperations();
         int product=  mathOperations.multiply(10,2);

        System.out.println(sum);
        System.out.println(product);
    }
}
