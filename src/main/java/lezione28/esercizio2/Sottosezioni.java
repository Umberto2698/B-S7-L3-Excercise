package lezione28.esercizio2;

import java.util.List;

public class Sottosezioni implements element {
    private int size;

    private String content;

    private List<Page> pages;

    @Override
    public String getContent() {
        pages.forEach(page -> content += page.getContent() + System.lineSeparator());
        return content;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getSize() {
        return pages.size();
    }

    @Override
    public List<String> getAuthor() {
        return null;
    }
}
