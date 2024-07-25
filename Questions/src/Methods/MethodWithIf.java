package Methods;

public class MethodWithIf {

    // check the age if user is eligible or not
    public void checkAge(int age){
        if(age<18){
            System.out.println("You are not eligible");
        }else{
            System.out.println("you are eligible");
        }
    }

    public static void main(String[]args){
        MethodWithIf check=new MethodWithIf();
        check.checkAge(25);

    }
}
