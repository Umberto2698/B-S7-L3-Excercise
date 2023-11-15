package lezione28.esercizio1;

import java.util.Date;


public class Info {
    private String nome;
    private String cognome;
    private Date datadiNascita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDatadiNascita() {
        return datadiNascita;
    }

    public void setDatadiNascita(Date datadiNascita) {
        this.datadiNascita = datadiNascita;
    }
}
