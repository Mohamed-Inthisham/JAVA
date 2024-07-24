package ForLoop;

public class Patterns {

    public static void main(String[]args){
//        *
//        **
//        ***
//        ****
//        *****

        for(int i=0; i<=4; i++){  // i=rows outer loop
            for(int j=0; j<=i; j++ ){ //j=columns inner loop
                System.out.print("*"); // print '*' without moving to a new line
            }
            System.out.println(); //move to a new line after the inner loop finishes
        }
    }
}
