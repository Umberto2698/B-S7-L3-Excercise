package lezione28.esercizio1;

public abstract class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

    public UserData() {
    }

    public UserData(String nomeCompleto, int eta) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
    }

    @Override
    public String getNomeConpleto() {
        return this.nomeCompleto;
    }

    @Override
    public int getEta() {
        return this.eta;
    }

}
