package lezione28.esercizio2;

import java.util.List;

public class Book implements element {
    private int price;
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
        String content = "";
        content += sections.stream().map(Sezioni::getContent);
        content += pages.stream().map(Page::getContent) + System.lineSeparator();
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        int size = 0;
        size += sections.stream().mapToInt(Sezioni::getSize).sum();
        size += pages.stream().mapToInt(Page::getSize).sum();
        return size;
    }


    public List<String> getAuthor() {
        return authors;
    }
}
