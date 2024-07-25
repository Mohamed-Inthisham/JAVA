public class Main {

    public void myMethod(){
        System.out.println("method 1 is printing");
    }

    public static void myMethod2(){
        System.out.println("method 2 is printing");
    }
    public static void main(String[] args) {
        myMethod2();
        Main main=new Main();
        main.myMethod();
    }
}