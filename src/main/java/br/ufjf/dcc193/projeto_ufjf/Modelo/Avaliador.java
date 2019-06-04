package br.ufjf.dcc193.projeto_ufjf.Modelo;

import java.util.List;

public class Avaliador {

    private int id;

    private int codigoAcesso;
    
    private String nomeCompleto;

    private String email;

    private List<Area> area;

    public Avaliador(){

    }

    public Avaliador(int codigoAcesso, String nomeCompleto, String email){
        this.codigoAcesso = codigoAcesso;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Area> getArea() {
        return area;
    }

    public void setArea(List<Area> areaConhecimento) {
        this.area = area;
    }

    

    


}