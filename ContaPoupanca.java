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

     public void Sacar(double valor) {

    if (getSaldo() > valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("saque realizado co sucess");
        super.enviarNotificacao("saque ", valor);
    } else {
        System.out.println("nao foi possivel realizar saque ");

    }}

    @Override
    public void Transferir(Conta contaParaDeposito, double valor) {
        double v = valor;
        v = v * 5 / 100;
        super.Sacar(v);
        super.Transferir(contaParaDeposito, valor);

    }
}

    // @Override



             // @Override
             //public void Deposito(Double valor){
             //super.Deposito(valor);
             //this.setSaldo(this.getSaldo() + this.getSaldo() * this.getRendimento());}}





