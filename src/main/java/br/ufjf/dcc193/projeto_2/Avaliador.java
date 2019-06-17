package br.ufjf.dcc193.projeto_2;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String codigo;

    @Override
    public String toString() {
        return "Nome:"+ nome;
    }

    public Avaliador(String nome,String email,String codigo){
        this.nome=nome;
        this.email=email;
        this.codigo=codigo;
    }
    public Avaliador(){
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
/**
 * @return the codigo
 */
public String getCodigo() {
    return codigo;
}/**
 * @return the email
 */
public String getEmail() {
    return email;
}/**
 * @return the nome
 */
public String getNome() {
    return nome;
}

/**
 * @param codigo the codigo to set
 */
public void setCodigo(String codigo) {
    this.codigo = codigo;
}/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
}/**
 * @param nome the nome to set
 */
public void setNome(String nome) {
    this.nome = nome;
}

    
}