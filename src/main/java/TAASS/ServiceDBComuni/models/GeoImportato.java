package TAASS.ServiceDBComuni.models;

public class GeoImportato {

    private String istat;
    private String comune;
    private String lng;
    private String lat;

    public GeoImportato(String istat, String comune, String lng, String lat) {
        this.istat = istat;
        this.comune = comune;
        this.lng = lng;
        this.lat = lat;
    }


    public String getIstat() {
        return istat;
    }

    public void setIstat(String istat) {
        this.istat = istat;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
