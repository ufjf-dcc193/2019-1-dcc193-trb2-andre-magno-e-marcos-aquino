package br.ufjf.dcc193.projeto_ufjf.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Revisao{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Avaliador avaliador;
    private Trabalho trabalho;
    private int nota;
    private String descricao;
    private int status;

    public Revisao(){

    }

    public Revisao(Avaliador avaliador, Trabalho trabalho, int nota, String descricao, int status){
        this.avaliador = avaliador;
        this.trabalho = trabalho;
        this.nota = nota;
        this.descricao = descricao;
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Avaliadores to string";

    public Avaliador getAvaliador() {
        return avaliador;
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


    public void setAvaliador(Avaliador avaliador) {
        this.avaliador = avaliador;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}