package lezione28.esercizio1;

public class InfoAdapter extends UserData {
    private Info info;
    private String nomeCompleto;
    private int eta;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return nomeCompleto = info.getNome() + info.getCognome();
    }
}
