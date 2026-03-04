package Bro.TwentyThree;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //FOR LOOPS. Execute some code for a CERTAIN amount of times.

        int intArray[] = new int[]{1, 2, 3, 4, 5};


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        String stringArray[] = new String[]{"One", "Two", "Three", "Four", "Five"};

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        System.out.println();

        int start = 10;

        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");
        System.out.println();

        // Double For Loop counter.

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "," + j);
            }
        }

    }

}
