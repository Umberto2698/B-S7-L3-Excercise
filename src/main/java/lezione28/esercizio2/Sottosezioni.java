package lezione28.esercizio2;

import java.util.List;

public class Sottosezioni implements element {
    private List<Page> pages;

    public Sottosezioni(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public String getContent() {
        String content = "";
        content += pages.stream().map(Page::getContent) + System.lineSeparator();
        return content;
    }

    @Override
    public int getSize() {
        int size = 0;
        size += pages.stream().mapToInt(Page::getSize).sum();
        return size;
    }

}
