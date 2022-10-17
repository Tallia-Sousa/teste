package com.br;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate datanascimento;
    private String cpf;
    private Endereco Endereco;

    public Cliente(String nome, LocalDate datanascimento, String cpf,Endereco Enderco){

        this.nome = nome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.Endereco = Enderco;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return Endereco;

    }
    public String getCidadeEndereco(){
        return this.Endereco.getCidade();
    }
    public String getUfEndereco(){
        return this.Endereco.getUf();
    }
    public String getLogradouroEndereco (){
        return this.Endereco.getLogradouro();
    }
    //t

}

