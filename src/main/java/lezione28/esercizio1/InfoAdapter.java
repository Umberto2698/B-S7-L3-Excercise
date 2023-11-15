package lezione28.esercizio1;

import java.time.LocalDate;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        int year = info.getDatadiNascita().toInstant().atZone(ZoneId.systemDefault()).getYear();
        int now = LocalDate.now().getYear();
        return now - year;
    }
}
