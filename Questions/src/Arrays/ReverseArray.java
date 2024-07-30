package Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] array){
        int n=array.length;
        int[] reversedArray= new int[n];
        for(int i =0; i<n; i++){
            reversedArray[i]=array[n-1-i];
        }
        return reversedArray;
    }

    public static void main(String [] args){
        int[] array={1,2,3,4,5};
        int[] reversedArray=reverseArray(array);

        System.out.print("original array\t");
        for(int num: array){
            System.out.print(num+" ");
        }
        System.out.print("\nreversed array\t");
        for(int num: reversedArray){
            System.out.print(num+" ");
        }



    }
}
