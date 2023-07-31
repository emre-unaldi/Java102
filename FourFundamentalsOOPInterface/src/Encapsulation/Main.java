package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 226);
        System.out.println("Book : " + book.getName() + " Sayfa : " + book.getPageNumber());

        book.setName("Azkaban Tutsağı");
        book.setPageNumber(386);

        System.out.println("Book : " + book.getName() + " Sayfa : " + book.getPageNumber());
    }
}
