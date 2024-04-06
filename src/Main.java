import java.util.LinkedList;

class Book {
    String title;
    String author;
    int yearOfPublish;

    public Book(String title, String author, int yearOfPublish) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    @Override
    public String toString() {
        return this.title + "/" + this.author + "/" + this.yearOfPublish;

    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Book> TestList = new LinkedList<>();

        TestList.add(new Book("BookA", "AuthorA", 1995));
        TestList.add(new Book("BookB", "AuthorB", 1996));
        TestList.add(new Book("BookC", "AuthorC", 1997));
        TestList.add(new Book("BookD", "AuthorD", 1998));
        TestList.add(new Book("BookE", "AuthorE", 1999));
        TestList.add(new Book("BookF", "AuthorF", 1995));
        TestList.add(new Book("BookG", "AuthorG", 1996));
        TestList.add(new Book("BookH", "AuthorH", 1997));
        TestList.add(new Book("BookI", "AuthorI", 1998));
        TestList.add(new Book("BookJ", "AuthorJ", 1999));

        for (int i = 0; i < TestList.size(); i++) {
            System.out.println(TestList.get(i).toString());
        }
    }
}

