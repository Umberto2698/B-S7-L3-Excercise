package lezione28.esercizio1;

public abstract class UserData {
    private String nomeCompleto;
    private int eta;

    public UserData() {
    }

    public UserData(String nomeCompleto, int eta) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
    }

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
