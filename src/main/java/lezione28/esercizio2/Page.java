package lezione28.esercizio2;

import java.util.List;

public class Page implements element {
    private String content;

    public Page(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<String> getAuthor() {
        return null;
    }
}
