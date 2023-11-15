package lezione28.esercizio2;

import java.util.List;

public class Sezioni implements element {
    private String content;
    private List<Page> pages;
    private List<Sottosezioni> subsections;

    public Sezioni(List<Sottosezioni> subsections, List<Page> pages) {
        this.pages = pages;
        this.subsections = subsections;
    }

    @Override
    public String getContent() {
        String content = "";
        content += subsections.stream().map(Sottosezioni::getContent);
        content += pages.stream().map(Page::getContent) + System.lineSeparator();
        return content;
    }

    @Override
    public int getSize() {
        int size = 0;
        size += subsections.stream().mapToInt(Sottosezioni::getSize).sum();
        size += pages.stream().mapToInt(Page::getSize).sum();
        return size;
    }
}
