package Bro.Aggregation;

public class Book {
    private String title;
    private int pages;
    private String author;

    public Book(String title, int pages, String author){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String displayInfo(){
        return this.title + " " + this.pages + " pages Written by: " + this.author;
    }

    public String getBookTitle(){
        return title;
    }

}
