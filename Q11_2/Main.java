package Q11_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> library = List.of(
                new Book(" Moby Dick ", " Herman Melville " , 720),
                new Book ( " 1984 ", " George Orwell " , 328) ,
                new Book ( " Ulysses " , " James Joyce " , 730) ,
                new Book ( " War and Peace " , " Leo Tolstoy " , 1225));
//List<String> titles = library.stream().map(Book::title).filter().sorted();
//Previous attempt was wrong because order matters because we need access to the whole book in order
// to filer by pages. If I use map before filter, I only have access to Strings
        List<String> titles = library.stream().filter(book -> book.pages() > 500)
                .map(book -> book.title()).sorted().toList();

    }
}
