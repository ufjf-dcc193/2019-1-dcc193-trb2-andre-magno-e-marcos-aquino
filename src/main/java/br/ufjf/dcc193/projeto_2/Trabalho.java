package br.ufjf.dcc193.projeto_2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Trabalho
 */
@Entity
public class Trabalho {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descricao;
    private String url;
    private String areaConhecimento;

    public Trabalho(String titulo,String descricao,String url,String areaConhecimento){
        this.titulo=titulo;
        this.descricao=descricao;
        this.url=url;
        this.areaConhecimento=areaConhecimento;
    }

    public Trabalho(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @param areaConhecimento the areaConhecimento to set
     */
    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }/**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }/**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }/**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }/**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * @return the areaConhecimento
     */
    public String getAreaConhecimento() {
        return areaConhecimento;
    }/**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }/**
     * @return the id
     */
    public Long getId() {
        return id;
    }/**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }/**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    
    
}