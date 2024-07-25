public class InputParameters {

    public static void names(String name,int age){
        System.out.println(name + age);
    }

    public static String all(String fname,int age, double salary){
        return fname+age+salary;
    }

    public void normal(String name, int age){
        System.out.println(name+age);
    }
    public static void main(String[]args){
        names("kasun",19);
        names("janaka",20);

        String results=all("dasun",26,5000.00);
        System.out.println(results);

        InputParameters normalMethod=new InputParameters();
        normalMethod.normal("shanaka",24);
    }
}
