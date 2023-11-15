package lezione28.esercizio2;

import java.util.List;

public class Sezioni implements element {
    private int size;
    private String content;
    private List<Page> pages;
    private List<Sottosezioni> subsections;

    public Sezioni(List<Sottosezioni> subsections, List<Page> pages) {
        this.pages = pages;
        this.subsections = subsections;
    }

    @Override
    public String getContent() {
        subsections.forEach(sottosezioni -> content += sottosezioni.getContent());
        pages.forEach(page -> content += page.getContent() + System.lineSeparator());
        return content;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getSize() {
        return pages.size() + subsections.size();
    }

    @Override
    public List<String> getAuthor() {
        return null;
    }
}
