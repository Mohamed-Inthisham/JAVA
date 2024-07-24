package ForLoop;

import java.util.Scanner;

public class Patterns {

    public static void main(String[]args){
//        *
//        **
//        ***
//        ****
//        *****

//        for(int i=0; i<=4; i++){  // i=rows outer loop
//            for(int j=0; j<=i; j++ ){ //j=columns inner loop
//                System.out.print("*"); // print '*' without moving to a new line
//            }
//            System.out.println(); //move to a new line after the inner loop finishes
//        }
//        --------------------------------------------------------------------------------

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the pattern count");
//        int rows=scanner.nextInt();
//        System.out.println("enter the pattern u want");
//        String patternStyle=scanner.next();
//
//        for(int i=0; i<=rows; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(patternStyle);
//            }
//            System.out.println();
//        }
//        --------------------------------------------------------------

//        Reverse pattern

        int numRows=5;

        for(int i=0; i<numRows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<numRows-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
