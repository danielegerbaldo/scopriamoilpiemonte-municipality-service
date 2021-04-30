package TAASS.ServiceDBComuni.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comuni")
public class Comune {
    public Comune() {
    }

    public Comune(Long istat, String nome, String CAP, String provincia) {
        this.istat = istat;
        this.nome = nome;
        this.CAP = CAP;
        this.provincia = provincia;
    }

    @Id
    private Long istat;

    @Column(name="nome")
    private String nome;

    @Column(name="CAP")
    private String CAP;

    @Column(name = "provincia")
    private String provincia;

    public Long getIstat() {
        return istat;
    }

    public void setIstat(Long id) {
        this.istat = istat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCAP() {
        return CAP;
    }

    public void setCAP(String CAP) {
        this.CAP = CAP;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
