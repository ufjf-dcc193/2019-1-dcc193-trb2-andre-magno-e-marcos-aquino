package br.ufjf.dcc193.projeto_2;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="revisao")
public class Revisao{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;

    @NotNull(message="Campo obrigatório!")
    private String status;
    private String descricao;
    private int nota;

    @OneToOne(fetch = FetchType.EAGER)
    private Avaliador avaliador;

    @OneToOne(fetch = FetchType.EAGER)
    private Trabalho trabalho;



    public Revisao() {

    }

    public Revisao(@NotNull(message = "Campo obrigatório!") String status, String descricao, int nota) {
        
        this.status = status;
        this.descricao = descricao;
        this.nota = nota;
    }

    public Revisao(@NotNull(message = "Campo obrigatório!") String status, String descricao, int nota,
            Avaliador avaliador, Trabalho trabalho) {
        
        this.status = status;
        this.descricao = descricao;
        this.nota = nota;
        this.avaliador = avaliador;
        this.trabalho = trabalho;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Avaliador getAvaliador() {
        return avaliador;
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

    
}