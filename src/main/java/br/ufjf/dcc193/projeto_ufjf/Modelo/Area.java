package br.ufjf.dcc193.projeto_ufjf.Modelo;

public class Area{

    private Integer id;

    private String descricao;

    public Area(){

    }

    public Area(String descricao){
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}