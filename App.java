package com.br;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner Entrada = new Scanner(System.in);
    static ArrayList<Conta> contas;//varias contas//listcontas

    public static void main(String[] args) {

        contas = new ArrayList<>();//insta a lista
        operacoes();
    }

    private static void operacoes() {
        System.out.println("OPERAÇÕES");
        System.out.println("1-Criar conta ");
        System.out.println("2-Depositar");
        System.out.println("3-Transferir");
        System.out.println("4-Sacar ");
        System.out.println("5-Listar");
        System.out.println("6-Saldo");
        int operacao = Entrada.nextInt();

        switch (operacao) {
            case 1:
                CriarConta();
            case 2:
                Depositar();
            case 3:
                Transferir();
            case 4:
                Sacar();
            case 5:
                Listar();
            case 6:
                Saldo();
        }

    }

    private static void CriarConta() {
        
        System.out.println("Informe o nome do cliente: ");
        String nome = Entrada.next();
        System.out.println("Informe o Cpf : ");
        String cpf = Entrada.next();
        System.out.println("Informe a data de nascimento: ");
        String dataString = Entrada.next();
        String[] dataseparada = dataString.split("/");
        LocalDate datanascimento = LocalDate.of(Integer.parseInt(dataseparada[2]), Integer.parseInt(dataseparada[1]), Integer.parseInt(dataseparada[0]));
        System.out.println("Informe sua cidade local : ");
        String cidade = Entrada.next();
        System.out.println("Informe o logradouro: ");
        String logradouro = Entrada.next();
        System.out.println("Infome o uf :");
        String uf = Entrada.next();
        Endereco endereco = new Endereco(cidade, logradouro, uf);
        Cliente cliente = new Cliente(nome, datanascimento, cpf, endereco);
        Conta conta = new Conta(cliente);
        contas.add(conta);
        System.out.println("Conta criada com sucesso ");
        operacoes();
    }

    private static Conta EncontrandoContas(int numero) {
        Conta conta = null;
        if (contas.size() > 0) {
            for (Conta cc : contas) {
                if (cc.getNumero() == numero) {
                    conta = cc;

                }
            }
        }
        return conta;
    }

    private static void Depositar() {
        System.out.println(" Digite o numero da conta ");
        int numero = Entrada.nextInt();//numero que o usuario digitou
        Conta conta = EncontrandoContas(numero);
        if (conta != null) {
            System.out.println(" Qual o valor que deseja depositar ?");
            double valor = Entrada.nextDouble();
            conta.Deposito(valor);
            System.out.println(" Valor depositado com sucesso ");

        } else {
            System.out.println(" Não foi possivel realizar o deposito ");
        }
        operacoes();
    }

    private static void Sacar() {
        System.out.println(" Digite o numero da conta: ");
        int numero = Entrada.nextInt();
        Conta conta = EncontrandoContas(numero);
        if (conta != null) {
            System.out.println(" Qual o valor do sac ? ");
            double valor = Entrada.nextDouble();
            conta.Sacar(valor);

            System.out.println("Sac realizado com sucesso ");
        } else {
            System.out.println("Não foi possivel realizar o sac ");
        }
        operacoes();
    }

    private static void Transferir() {
        System.out.println(" Numero da conta do remetente: ");
        int numeroremetente = Entrada.nextInt();
        Conta contaremetente = EncontrandoContas(numeroremetente);
        if (contaremetente != null) {
            System.out.println(" Numero da conta do destinatario: ");
            int numerodestinatario = Entrada.nextInt();
            Conta contadestinatario = EncontrandoContas(numerodestinatario);
            if (contadestinatario != null) {
                System.out.println(" Digite o valor da transferência ");
                double valor = Entrada.nextDouble();
                contaremetente.Tranferir(contadestinatario, valor);
                System.out.println("Valor  transferido com suscesso  ");
            } else {
                System.out.println(" Não foi possivel fazer a transferência ");
            }
        }

        operacoes();
    }

    private static void Listar() {
        if (contas.size() > 0) {
            for (Conta conta : contas) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Não ha contas para listar ");
        }
    }

    private static void Saldo() {
        System.out.println("Digite o numero da conta ");
        int numero = Entrada.nextInt();
        Conta conta = EncontrandoContas(numero);
        if (conta != null) {
            System.out.println(conta.getSaldo());
        }

        operacoes();
    }

}////////////
//tt