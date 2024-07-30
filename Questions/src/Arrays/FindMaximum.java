package Arrays;

public class FindMaximum {

    public static int maxNum(int [] array){
        int num = array[0];

        for(int i=0; i<array.length;i++){
            if(array[i]>num){
                num=array[i];
            }
        }
        return num;
    }

    public static void main(String[]args){
        int [] num={250,80,36,4,786};
        int largeNum=maxNum(num);
        System.out.println(largeNum);

    }
}
