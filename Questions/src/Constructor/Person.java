package Constructor;

public class Person {
//    1- Create a Person class with a constructor.

    public String name;
    public int age;
    public String address;

    Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void display_info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

    }

    public static void main(String[]args){
        Person person=new Person("chanuka",19,"colombo");
        person.display_info();
    }
}
