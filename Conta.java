package com.br;

import java.time.LocalDate;
import java.util.Random;

public class Conta {
    private static int contador = 1;
    private static Random generate = new Random();
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente Cliente;

    public Conta(Cliente Cliente) {
        this.agencia = agencia;
        this.numero = contador;
        this.saldo = saldo;
        this.Cliente = Cliente;
        contador += 1;

    }

    public void Sacar(double valor) {
        if (valor > 0 && this.getSaldo() >= 0) {
            setSaldo(getSaldo() - valor);
            System.out.println(" Saque realizado com sucesso ");
        } else {
            System.out.println(" Não foi possivel realizar o saque ");
        }
    }

    public void Tranferir(Conta contaParaDeposito, Double valor) {
        if (valor > 0 && this.getSaldo() >= 0) {
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println(" Transferência realizada com sucesso ");
        } else {
            System.out.println(" Não foi possivel realizar a tranferência ");
        }
    }

    public void Deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println(" Deposito realizado com sucesso ");
        } else {
            System.out.println("Não foi possivel realizar o depoisito ");
        }
    }


    public int getNumero() {
        return numero;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public String getNomecliente() {
        return this.Cliente.getNome();
    }

    public LocalDate getDatacliente() {
        return this.Cliente.getDatanascimento();
    }

    public String getCpfcliente() {
        return this.Cliente.getCpf();

    }

    public String getClienteEnderecocidade() {
        return this.Cliente.getCidadeEndereco();
    }

    public String getClienteEnderecoUf() {
        return this.Cliente.getUfEndereco();
    }

    public String getClienteLogradouroEndereco() {
        return this.Cliente.getLogradouroEndereco();
    }

    public String toString() {
        return " Nome Cliente: " + getNomecliente() + "\n" +
                " Saldo: " + getSaldo() + "\n" +
                " Numero da conta: " + numero + "\n" +
                " Data Nascimento: " + getDatacliente() + "\n" +
                " Cpf: " + getCpfcliente() + "\n"  +
                " Endereço: " + "Cidade: " +getClienteEnderecocidade() + ","
                +"Logradouro: " +getClienteLogradouroEndereco() + ","
                + "Uf: " + getClienteEnderecoUf();
    }
//t
}

