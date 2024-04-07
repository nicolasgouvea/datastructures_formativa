import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class User {
    String name;
    Stack <Book> history;
    public User(String nameUser){
        this.name = nameUser;
        this.history = new Stack<>();
    }

    public void addBookToHistory(Book bookToBeAdded) {
        history.push(bookToBeAdded);
    }

}


class Book {
    String title;
    String author;
    int yearOfPublish;

    Queue<User> waitList;

    public Book(String title, String author, int yearOfPublish) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.waitList = new LinkedList<>();

    }
    @Override
    public String toString() {
        return this.title + "/" + this.author + "/" + this.yearOfPublish;
    }

    public void adduserWaitingList(User userToBeAdded) {
        this.waitList.add(userToBeAdded);
    }

    public void printWaitingList(){
        System.out.println("Mostrando a lista de espera:");
        for (User user: this.waitList ) {
            System.out.println(user.name);
        }

    }

}
public class Main {

    public static void main(String[] args) {
        LinkedList<Book> testList = new LinkedList<>();

        User student = new User("Nicolas");
        User user01 = new User("Asdf");
        User user02 = new User("asdfg");
        User user03 = new User("asdfgh");

        Book bookA = new Book("BookA", "AuthorA", 1995);
        Book bookB = new Book("BookB", "AuthorB", 1996);
        Book bookC = new Book("BookC", "AuthorC", 1997);
        Book bookD = new Book("BookD", "AuthorD", 1998);
        Book bookE = new Book("BookE", "AuthorE", 1999);
        Book bookF = new Book("BookF", "AuthorF", 1995);
        Book bookG = new Book("BookG", "AuthorG", 1996);
        Book bookH = new Book("BookH", "AuthorH", 1997);
        Book bookI = new Book("BookI", "AuthorI", 1998);
        Book bookJ = new Book("BookJ", "AuthorJ", 1999);

        testList.add(new Book("BookA", "AuthorA", 1995));
        testList.add(new Book("BookB", "AuthorB", 1996));
        testList.add(new Book("BookC", "AuthorC", 1997));
        testList.add(new Book("BookD", "AuthorD", 1998));
        testList.add(new Book("BookE", "AuthorE", 1999));
        testList.add(new Book("BookF", "AuthorF", 1995));
        testList.add(new Book("BookG", "AuthorG", 1996));
        testList.add(new Book("BookH", "AuthorH", 1997));
        testList.add(new Book("BookI", "AuthorI", 1998));
        testList.add(new Book("BookJ", "AuthorJ", 1999));


//      implementando a fila
        bookA.adduserWaitingList(student);
        bookA.adduserWaitingList(user01);
        bookA.adduserWaitingList(user02);
        bookA.adduserWaitingList(user03);

//      Demonstrando pilha
        student.addBookToHistory(bookA);
        student.addBookToHistory(bookB);
        student.addBookToHistory(bookC);
        student.addBookToHistory(bookD);
        student.addBookToHistory(bookE);
        student.addBookToHistory(bookF);
        student.addBookToHistory(bookG);
        student.addBookToHistory(bookH);
        student.addBookToHistory(bookI);
        student.addBookToHistory(bookJ);


    }
}




