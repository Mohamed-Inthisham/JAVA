package Variable;

//        1. Create a class called Counter with the following:
//            A static variable staticCounter.
//            A non-static variable nonStaticCounter.
//            Create a method called setStaticCount(int num) to set the value of the
//                    staticCounter
//             Create a method called setNonStaticCount(int num) to set the value of
//                    the nonStaticCounter

//Create a main class to instantiate multiple Counter objects and observe the values of
//        staticCounter and nonStaticCounter.
//Create two instances/objects of Counter class. (counter1 and counter2)
//        Then set the nonStaticCounter value of the counter1 object to 30;
//        Then set the staticCounter value of the counter1 object to 45;
//        Then set the nonStaticCounter value of the counter2 object to 65;
//        Then set the staticCounter value of the counter2 object to 75;
//        Print the value of the staticCounter and nonStaticCounter of both
//counter1 and counter2


public class StaticNonStatic {
    static int staticCounter;     // Static variable
    int nonStaticCounter; // Non-static variable

    public void setStaticCount(int num) { // Method to set the value of the staticCounter
        staticCounter = num;
    }

    public void setNonStaticCount(int num) { // Method to set the value of the nonStaticCounter
        nonStaticCounter = num;
    }

    public static void main(String[] args){
        StaticNonStatic counter1 = new StaticNonStatic();
        StaticNonStatic counter2 = new StaticNonStatic();

        counter1.setNonStaticCount(30);
        counter1.setStaticCount(45);

        counter2.setNonStaticCount(65);
        counter2.setStaticCount(75);

        System.out.println("counter1 - nonStaticCounter: " + counter1.nonStaticCounter); // Output: 30
        System.out.println("counter1 - staticCounter: " + StaticNonStatic.staticCounter); // Output: 75 (changed by counter2)

        System.out.println("counter2 - nonStaticCounter: " + counter2.nonStaticCounter); // Output: 65
        System.out.println("counter2 - staticCounter: " + StaticNonStatic.staticCounter); // Output: 75
        // The reason both counter1 and counter2 show the same value for staticCounter (75) is due to the nature of static variables in Java.
        // Static variables are shared among all instances of a class. This means there is only one copy of a static variable, regardless of how many instances of the class are created.
        // Therefore, any change to staticCounter by one instance will reflect across all instances. This is why both counter1 and counter2 show the same value for staticCounter.
    }
}
