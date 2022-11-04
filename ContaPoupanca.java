package com.br;

public  class ContaPoupanca extends Conta {



    private double taxa = 0.05;
 private double rendimento;
    public ContaPoupanca(Cliente Cliente, String tipoconta, Notificacao notificacao) {
        super(Cliente, tipoconta, notificacao);
        this.rendimento = 0.10;

    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
   }

   public double getRendimento() {
        return rendimento;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
    // @Override
    //public void Transferir(Conta contaParaDeposito, double valor) {

        // if(valor > 0){
            // double taxa = valor * 5 / 100;

            // contaParaDeposito.setSaldo(valor + (contaParaDeposito.getSaldo() - taxa));
             //valor = valor - taxa;
             //super.Transferir(contaParaDeposito, valor);
            // super.Transferir(contaParaDeposito, valor);
             //super.enviarNotificacao("Transferência", valor);
        // }
        // super.Transferir(contaParaDeposito, valor);
    // }
//}


              @Override
             public void Deposito(Double valor){
             super.Deposito(valor);
             this.setSaldo(this.getSaldo() + this.getSaldo() * this.getRendimento());}}





