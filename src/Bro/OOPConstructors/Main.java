package Bro.OOPConstructors;

public class Main {
    public static void main(String[] args) {
        // Constructor = A Special method to initialize objects.
        //               You can pass arguement to a constructor.
        //               And set up initial values

        Student student1 = new Student("Tom", 12, 120, true);

        studentToString(student1);

    }

    public static void studentToString(Student studentToString) {

        String[] studentArray = studentToString.toString().split(",");

        for (int i = 0; i < studentArray.length; i++) {
            switch (i) {
                case 0 -> System.out.println("Name: " + studentArray[i]);
                case 1 -> System.out.println("Age: " + studentArray[i]);
                case 2 -> System.out.println("GPA: " + studentArray[i]);
                case 3 -> System.out.println("Is Enrolled: " + studentArray[i]);
            }
        }
    }
}
