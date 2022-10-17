package com.br;

public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String logradouro,String cidade, String uf){
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;

    }

    public String getUf() {
        return uf;
    }
} //t
