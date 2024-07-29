public class Main {
    public static void main(String[] args) {
        String [] cars; // array variable declaration
        String[] names={"santhush","dasun","malinga"}; // array initialization
        int[] numbers={1,2,3};

        // access the element of an array
        String[] students={"santhush","dasun","malinga","chamara"};
        System.out.println(students[2]);

        // change an array element
        students[2]="chathura";
        System.out.println(students[2]);

        // array length
        System.out.println(students.length);

        // array looping using for-each
        String[] campus ={"japura","SLIIT","moratuwa","Jaffna","ACBT"};
        for(String cNames : campus){
            System.out.println(cNames);
        }
    }
}