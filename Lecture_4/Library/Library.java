package Library;

import java.util.HashMap;

public class Library {

    HashMap<Book, Integer> map = new HashMap<>();

    void addBook(Book book, int copies) {
        map.put(book, copies);
    }

    int get(Book bookTitle, int copies) {
        int x = map.get(bookTitle); // Общее количество книг в библиотеке, из которых читатель хочет взять экзмепляр

        if (x >= copies) {
            map.put(bookTitle, x - copies);
            return copies;
        } else {
            // только если x < copies (кол-во таких книг меньше, чем требуется получателю)
            map.put(bookTitle, 0);
            return x;
        }
    }

    void put(Book bookTitle, int copies) {
        int y = map.get(bookTitle); // Общее количество книг в библиотеке, к которым добавятся сданные читателем книги
        map.put(bookTitle, y + copies);
    }

}
