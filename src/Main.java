import java.util.*;

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

    public void printHistory() {
        System.out.println("Histórico de leitura para " + name + ":");
        for (Book book : history) {
            System.out.println(book);
        }
    }
}

class Book {
    String title;
    String author;
    int yearOfPublish;
    Set<Book> recommendations;
    Queue<User> waitList;

    public Book(String title, String author, int yearOfPublish) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.waitList = new LinkedList<>();
        this.recommendations = new HashSet<>();
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

    public void addRecommendations(Book book){
        recommendations.add(book);
    }

    public void printRecommendations() {
        System.out.println("Recomendações para " + title + ":");
        for (Book book : recommendations) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return this.title + "/" + this.author + "/" + this.yearOfPublish;
    }

}
public class Main {

    public static void main(String[] args) {
        LinkedList<Book> bookList = new LinkedList<>();
        HashMap<Book, Set<Book>> graph = new HashMap<>();

        //Criando usuários
        User student = new User("Nicolas");
        User user01 = new User("Andressa");
        User user02 = new User("Benjamin");
        User user03 = new User("Prof.Dr. Wellington");

        Book bookA = new Book("BookA", "AuthorA", 1990);
        Book bookB = new Book("BookB", "AuthorB", 1991);
        Book bookC = new Book("BookC", "AuthorC", 1992);
        Book bookD = new Book("BookD", "AuthorD", 1993);
        Book bookE = new Book("BookE", "AuthorE", 1994);
        Book bookF = new Book("BookF", "AuthorF", 1995);
        Book bookG = new Book("BookG", "AuthorG", 1996);
        Book bookH = new Book("BookH", "AuthorH", 1997);
        Book bookI = new Book("BookI", "AuthorI", 1998);
        Book bookJ = new Book("BookJ", "AuthorJ", 1999);

        bookList.add(new Book("BookA", "AuthorA", 1990));
        bookList.add(new Book("BookB", "AuthorB", 1991));
        bookList.add(new Book("BookC", "AuthorC", 1992));
        bookList.add(new Book("BookD", "AuthorD", 1993));
        bookList.add(new Book("BookE", "AuthorE", 1994));
        bookList.add(new Book("BookF", "AuthorF", 1995));
        bookList.add(new Book("BookG", "AuthorG", 1996));
        bookList.add(new Book("BookH", "AuthorH", 1997));
        bookList.add(new Book("BookI", "AuthorI", 1998));
        bookList.add(new Book("BookJ", "AuthorJ", 1999));

        // Implementando a fila: adicionando usuários a fila de espera
        bookA.adduserWaitingList(student);
        bookA.adduserWaitingList(user01);
        bookA.adduserWaitingList(user02);
        bookA.adduserWaitingList(user03);

        // Demonstrando pilha: adicionando livros ao histórico de usuários
        student.addBookToHistory(bookA);
        student.addBookToHistory(bookB);
        student.addBookToHistory(bookC);
        user01.addBookToHistory(bookD);
        user01.addBookToHistory(bookE);
        user01.addBookToHistory(bookF);
        user02.addBookToHistory(bookG);
        user02.addBookToHistory(bookH);
        user03.addBookToHistory(bookI);
        user03.addBookToHistory(bookJ);

        // Adicionando recomendações
        bookA.addRecommendations(bookB);
        bookA.addRecommendations(bookC);
        bookB.addRecommendations(bookD);
        bookB.addRecommendations(bookE);
        bookC.addRecommendations(bookF);
        bookC.addRecommendations(bookG);
        bookD.addRecommendations(bookH);
        bookD.addRecommendations(bookI);
        bookE.addRecommendations(bookJ);

        // Construindo o grafo
        graph.put(bookA, bookA.recommendations);
        graph.put(bookB, bookB.recommendations);
        graph.put(bookC, bookC.recommendations);
        graph.put(bookD, bookD.recommendations);
        graph.put(bookE, bookE.recommendations);
        graph.put(bookF, bookF.recommendations);
        graph.put(bookG, bookG.recommendations);
        graph.put(bookH, bookH.recommendations);
        graph.put(bookI, bookI.recommendations);
        graph.put(bookJ, bookJ.recommendations);

        System.out.println("Todos os livros disponíveis:" + bookList);

        student.printHistory();
        bookA.printWaitingList();
        bookA.printRecommendations();


    }
}
