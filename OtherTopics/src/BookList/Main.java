package BookList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        LinkedHashMap<String, String> bookMap = new LinkedHashMap<>();

        bookArrayList.add(new Book("Harry Potter 1", 80, "J.K. Rowling 1", 2001));
        bookArrayList.add(new Book("Harry Potter 2", 43, "J.K. Rowling 2", 2002));
        bookArrayList.add(new Book("Harry Potter 3", 50, "J.K. Rowling 3", 2003));
        bookArrayList.add(new Book("Harry Potter 4", 230, "J.K. Rowling 4", 2004));
        bookArrayList.add(new Book("Harry Potter 5", 100, "J.K. Rowling 5", 2005));
        bookArrayList.add(new Book("Harry Potter 6", 110, "J.K. Rowling 6", 2006));
        bookArrayList.add(new Book("Harry Potter 7", 260, "J.K. Rowling 7", 2007));
        bookArrayList.add(new Book("Harry Potter 8", 270, "J.K. Rowling 8", 2008));
        bookArrayList.add(new Book("Harry Potter 9", 280, "J.K. Rowling 9", 2009));
        bookArrayList.add(new Book("Harry Potter 10", 90, "J.K. Rowling 10", 2010));

        for (Book book : bookArrayList) {
            bookMap.put(book.getName(), book.getAuthor());
        }

        for (String book : bookMap.keySet()) {
            System.out.println("Kitap Adý : " + book + " - Yazar : " + bookMap.get(book));
        }

        List<Book> filteredBookArrayList = bookArrayList.stream().filter(book -> book.getPageNumber() > 100).toList();

        System.out.println("Filtrelenmiþ Kitaplar");
        for(Book book : filteredBookArrayList){
            System.out.println(book.getName() + " - " + book.getPageNumber());
        }
    }
}
