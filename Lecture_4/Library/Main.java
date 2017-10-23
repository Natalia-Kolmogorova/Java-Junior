package Library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Преступление и наказание";
        book1.author = "Достоевский";
        book1.pagesNum = 400;

        Book book2 = new Book();
        book2.title = "Война и мир";
        book2.author = "Толстой";
        book2.pagesNum = 2000;

        Book book3 = new Book();
        book3.title = "Отцы и дети";
        book3.author = "Тургенев";
        book3.pagesNum = 300;

        Library library = new Library();
        library.addBook(book1, 5);
        library.addBook(book2, 10);
        library.addBook(book3, 1);

        int x = library.get(book1, 2);
        System.out.println(x);

    }
}
