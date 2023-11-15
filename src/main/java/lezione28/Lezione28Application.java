package lezione28;

import lezione28.esercizio2.Book;
import lezione28.esercizio2.Page;
import lezione28.esercizio2.Sezioni;
import lezione28.esercizio2.Sottosezioni;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Lezione28Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Lezione28Application.class, args);

        Page page1 = new Page("BlalalalallanfwofjkjsFS");
        Page page2 = new Page("1398120839012941");
        Page page3 = new Page("Blalalal72389423894284238942allanfwofjkjsFS");

        Sottosezioni sottosezione1 = new Sottosezioni(List.of(page1, page2));
        Sottosezioni sottosezione2 = new Sottosezioni(List.of(page2, page2));

        Sezioni sezione = new Sezioni(List.of(sottosezione2), List.of(page1));

        Book book = new Book(List.of("Beppe", "Marcello"), List.of(sezione), List.of(page1, page3, page2), 50);
        System.out.println(book.getContent());
        System.err.println("authors= " + book.getAuthor());
        System.out.println("book price= " + book.getPrice());
        System.err.println("book size= " + book.getSize());

        System.out.println("section size= " + sezione.getSize());

        System.err.println(page1.getContent());

    }
}
