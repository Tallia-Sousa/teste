package com.br;


public class ContaCorrente extends Conta {

    private double chequeespecial = 500;
    private double devedor;


    private int contador;
    public ContaCorrente(Cliente Cliente, String tipoconta, Notificacao notificacao) {

        super(Cliente, tipoconta,  notificacao);
    }


    public double getChequeespecial() {
        return chequeespecial;
    }

    @Override
    public void Sacar(double valor) {
        if (getSaldo() > 0) {

            System.out.println("");
        }
        if (getSaldo() < 0) {
  
            valor = valor + getChequeespecial();
        }
        super.Sacar(valor);
        System.out.println("Cliente usando o cheque especial");


    }
    @Override
    public void Transferir(Conta contaParaDeposito, double valor){
       this.contador += 1;

        if(this.contador <= 2){
            super.Transferir(contaParaDeposito, valor);

        }
        else {
            double taxa = valor * 5 / 10;

            contaParaDeposito.setSaldo(valor + (contaParaDeposito.getSaldo() - taxa));
            valor = valor - taxa;
            super.Transferir(contaParaDeposito, valor);
            super.Transferir(contaParaDeposito, valor);
            super.enviarNotificacao("transferencia de ", valor);
        }
    }



    }


