package TAASS.ServiceDBComuni.models;

public class CAPImportato {

    private String istat;
    private String CAP;

    public CAPImportato(String istat, String CAP) {
        this.istat = istat;
        this.CAP = CAP;
    }

    public String getIstat() {
        return istat;
    }

    public void setIstat(String istat) {
        this.istat = istat;
    }

    public String getCAP() {
        return CAP;
    }

    public void setCAP(String CAP) {
        this.CAP = CAP;
    }
}
