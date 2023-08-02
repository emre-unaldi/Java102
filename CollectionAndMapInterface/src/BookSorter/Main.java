package BookSorter;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new BookNameComparator());

        books.add(new Book("Harry Potter ve Felsefe Taşı", 450, "J.K Rowling","1997"));
        books.add(new Book("Harry Potter ve Sırlar Odası", 200, "J.K Rowling","1998"));
        books.add(new Book("Harry Potter ve Azkaban Tutsağı", 650, "J.K Rowling","1999"));
        books.add(new Book("Harry Potter ve Ateş Kadehi", 400, "J.K Rowling","2000"));
        books.add(new Book("Harry Potter ve Melez Prens", 350, "J.K Rowling","2003"));

        System.out.println("Kitap Adına Göre Sıralama");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println("Kitap Adı : " + book.getName() +
                    " | Sayfa Sayısı " + book.getPageNumber() +
                    " | Yazar : " + book.getAuthor() +
                    " | Yayın Tarihi : " + book.getReleaseDate());
        }

        System.out.println("-------------------------------");

        TreeSet<Book> books1 = new TreeSet<>(new OrderPageNumberComparator());

        books1.add(new Book("Harry Potter ve Felsefe Taşı", 450, "J.K Rowling","1997"));
        books1.add(new Book("Harry Potter ve Sırlar Odası", 200, "J.K Rowling","1998"));
        books1.add(new Book("Harry Potter ve Azkaban Tutsağı", 650, "J.K Rowling","1999"));
        books1.add(new Book("Harry Potter ve Ateş Kadehi", 400, "J.K Rowling","2000"));
        books1.add(new Book("Harry Potter ve Melez Prens", 350, "J.K Rowling","2003"));

        System.out.println("Sayfa Sayısına Göre Sıralama");
        for (Book book : books1){
            System.out.println("Kitap Adı : " + book.getName() +
                    " | Sayfa Sayısı " + book.getPageNumber() +
                    " | Yazar : " + book.getAuthor() +
                    " | Yayın Tarihi : " + book.getReleaseDate());
        }
    }
}
