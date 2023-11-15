package lezione28.esercizio2;

import java.util.List;

public class Book implements element {
    private int price;
    private int size;
    private String content;
    private List<Page> pages;
    private List<Sezioni> sections;
    private List<String> authors;

    public Book(List<String> authors, List<Sezioni> sections, List<Page> pages, int price) {
        this.authors = authors;
        this.sections = sections;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String getContent() {
        content = "";
        sections.forEach(sezioni -> content += sezioni.getContent());
        pages.forEach(page -> content += page.getContent() + System.lineSeparator());
        return content;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        return pages.size() + sections.size();
    }

    @Override
    public List<String> getAuthor() {
        return authors;
    }
}
