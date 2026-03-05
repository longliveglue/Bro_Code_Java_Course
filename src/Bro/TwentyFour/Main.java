package Bro.TwentyFour;

public class Main {
    public static void main(String[] args){

        //break = Break out of a loop (Stop)
        //continue = skip current iteration.


        for (int i = 0; i < 10; i++){

            if(i == 5){
                continue;// This will skip the below code but continue to use 6, 7, 8, 9 etc
            }
            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 10; i > 0; i--){

            if(i == 5){
                break;// This will cancel the for loop
            }
            System.out.print(i + " ");

        }


    }

}
