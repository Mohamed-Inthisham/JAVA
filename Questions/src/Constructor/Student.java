package Constructor;

public class Student {
    public String name;
    public int age;
    public double grade;

    Student(String name,int age,double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public void updateGrade(String name,int age,double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public void displayInfo(){
        System.out.println(name +" "+age+" "+grade);
    }
    public static void main(String [] args){
        Student student=new Student("banuka",20,20.5);
        student.updateGrade("inthi",24,60.4);
        student.displayInfo();
    }
}
