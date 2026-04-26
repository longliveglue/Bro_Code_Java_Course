package Bro.Aggregation;

public class Main {
    public static void main(String[] args) {

        //Aggregation = Represents a "has-a" relationship between objects.
        //one object contains another object as part of its structure.
        //but the contained objects/s can exist independently.

        Book book1 = new Book("The Last Rotation", 2000, "Tom Hamilton");
        Book book2 = new Book("The Bible", 10000, "God");
        Book book3 = new Book("The Quoran", 10000, "God");
        Book book4 = new Book("The Tora", 10000, "God");

        Libary libary = new Libary(book1);
        
        libary.addBook(book2);
        libary.addBook(book3);
        libary.addBook(book4);

        System.out.println(libary.getTitles());

       if(libary.searchForBook(book1) != null){
           System.out.println(libary.searchForBook(book1).displayInfo());
       }

    }
}
