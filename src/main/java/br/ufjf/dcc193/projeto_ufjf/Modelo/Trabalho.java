package br.ufjf.dcc193.projeto_ufjf.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String titulo;

    private String descricao;

    private String url;

    private Area area;


    public Trabalho(){

    }

    public Trabalho(String titulo, String descricao, String url, Area area){

        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
        this.area = area;

    }



    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "TRabalho to string";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }    
}