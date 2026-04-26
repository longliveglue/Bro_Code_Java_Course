package Bro.Aggregation;

public class Libary {

    private Book[] books = new Book[100];
    private int numberOfBooks = 1;

    public Libary(Book book) {

        books[0] = book;
    }

    public void addBook(Book newBook) {

        books[numberOfBooks] = newBook;
        numberOfBooks++;
    }

    public Book searchForBook(Book book) {
        for (Book bookToCheck : books) {
            if (bookToCheck.getBookTitle().equals(book.getBookTitle())) {
                return bookToCheck;
            }

        }

        return null;
    }

    public String getTitles() {
        String allTitles = "";

        for (int i = 0; i < numberOfBooks; i++) {

            allTitles = allTitles + books[i].getBookTitle() + ", ";
        }

        return allTitles;
    }

}

