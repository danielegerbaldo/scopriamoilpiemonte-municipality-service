package TAASS.ServiceDBComuni.models;

public class ComuneImportato {

    private String istat;
    private String comune;
    private String regione;
    private String provincia;
    private String indirizzo;

    public ComuneImportato(String istat, String comune, String regione, String provincia, String indirizzo){
        this.istat = istat;
        this.comune = comune;
        this.regione = regione;
        this.provincia = provincia;
        this.indirizzo = indirizzo;
    }


    public String getIstat() {
        return istat;
    }

    public String getComune() {
        return comune;
    }

    public String getRegione() {
        return regione;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIstat(String istat) {
        this.istat = istat;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }


}
