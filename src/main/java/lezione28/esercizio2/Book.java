package lezione28.esercizio2;

import java.util.List;

public class Book implements element {
    private int price;
    private int size;
    private String content;
    private List<Page> pages;
    private List<Sezioni> sections;
    private List<String> authors;

    @Override
    public String getContent() {
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
