package Bro.OverloadedConstructors;

public class Main {
    public static void main(String[] args){
        //Overloaded Constructors = Allow a class to have multiple constructors.
        //                          With different parameter lists.
        //                          Enable objects to be initialized in various ways.


        User user1 = new User("Thomas");
        User user2 = new User("Laura", "Laura.hamilton@web.de");
        User user3 = new User("Matilda", "mdog@icloud.com", 15);


        String[] currentUser = user1.toString().split(",");

        for(String detail : currentUser){
            System.out.println(detail);
        }


    }

}
