package lezione28.esercizio2;

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
    public int getSize() {
        return 1;
    }
}
