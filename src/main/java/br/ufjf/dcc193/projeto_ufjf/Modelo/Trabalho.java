package br.ufjf.dcc193.projeto_ufjf.Modelo;



public class Trabalho {


    private Integer id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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