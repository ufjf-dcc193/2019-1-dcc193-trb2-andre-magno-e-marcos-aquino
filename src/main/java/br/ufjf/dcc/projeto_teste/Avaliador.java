package br.ufjf.dcc.projeto_teste;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Avaliador
 */
@Entity
public class Avaliador {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String titulo;

    @Override
    public String toString() {
        return super.toString();
    }

    public Avaliador(String titulo){
        this.titulo=titulo;

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
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    
}