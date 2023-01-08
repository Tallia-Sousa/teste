package Classes.java;
import Classes.java.Funcionario;

import javax.swing.*;
import java.time.LocalDate;

import static Executavel.java.IfBeauty.servicos;

public class Servicos {
    private static int contador = 1;
    private String nome;
    private String descricao;
    private double valor;
    private int codigo;
    private LocalDate servico;
    private Funcionario funcionario;

    public Servicos(String nome, String descricao, double valor, LocalDate servico, Funcionario funcionario) {
        this.descricao = descricao;
        this.nome = nome;
        this.valor = valor;
        this.funcionario = funcionario;
        this.codigo = contador;
        contador += 1;
        this.servico = servico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void remover(Servicos servico, int codigo) {
        if (servico.getCodigo() == codigo) {
            servicos.remove(servico);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível remover serviço");
        }
    }

    public String getDescricao() {

        return descricao;
    }

    public void alterar(Servicos servico, int codigo, String nome, double valor, String descricao, String nomefuncionario) {
        if (servico.getCodigo() == codigo) {
            servico.setValor(valor);
            servico.setDescricao(descricao);
            servico.setNome(nome);
            servico.funcionario.setNome(nomefuncionario);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o serviço!");
        }
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Codigo: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "valor: " + getValor() + "\n" +
                "descriçao: " + getDescricao();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionarioNome(String nome) {
        this.funcionario.setNome(nome);
    }
}}
