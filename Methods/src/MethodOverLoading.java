public class MethodOverLoading {

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }


    public static void main(String[]args){

        MethodOverLoading method=new MethodOverLoading();
        System.out.println(method.add(2,5)); // method 1
        System.out.println(method.add(4,5,6)); //method 2
        System.out.println(method.add(2.5,5.6,7.9));


    }
}
