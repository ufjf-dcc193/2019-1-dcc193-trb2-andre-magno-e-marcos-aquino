package br.ufjf.dcc193.projeto_ufjf.Modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avaliador {

    @Id

    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private int codigoAcesso;
    private String nomeCompleto;
    private String email;
    private List<Area> area;

    public Avaliador(){

    }

    public Avaliador(int codigoAcesso, String nomeCompleto, String email,List<Area> area){
        this.codigoAcesso = codigoAcesso;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.area = area;
    }

    @Override
    public String toString() {
        return nomeCompleto;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    public int getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(int codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    public void setArea(List<Area> area) {
        this.area = area;
    }

   
    public List<Area> getArea() {
        return area;
    }

    
    

    


}