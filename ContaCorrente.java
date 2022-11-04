package com.br;


public class ContaCorrente extends Conta {

    private double chequeespecial = 500;
    private double taxa;


    private int contador;
    public ContaCorrente(Cliente Cliente, String tipoconta, Notificacao notificacao) {

        super(Cliente, tipoconta,  notificacao);

        this.taxa = 0;

    }

    public double getTaxa() {
        return taxa;
    }

    public void setChequeespecial(double chequeespecial) {
        this.chequeespecial = chequeespecial;
    }

    public void setTaxa(double devedor) {
        this.taxa = devedor;
    }

    public double getChequeespecial() {
        return chequeespecial;
    }

    @Override
    public void Sacar (double valor) {
      double saldocomLimite = this.getSaldo() + getChequeespecial();
     if((saldocomLimite - valor) >= 0) {
         this.setSaldo(this.getSaldo() - valor);
         super.Sacar(valor);
     }
     }


    @Override
        public void Transferir(Conta contaParaDeposito, double valor){
            this.contador += 1;

            if (this.contador <= 2) {
                super.Transferir(contaParaDeposito, valor);

            } else {
                double taxa = valor * 5 / 100;

                contaParaDeposito.setSaldo(valor + (contaParaDeposito.getSaldo() - taxa));
                valor = valor - taxa;
                super.Transferir(contaParaDeposito, valor);
                super.enviarNotificacao("transferencia de ", valor);
            }
        }
   // @Override
   // public void Deposito(Double valor) {
      //  double taxa = getTaxa();
       // if(valor > getTaxa()) {
         //   super.Deposito(valor);
         //   setChequeespecial(getChequeespecial() + getTaxa());
           // setTaxa(getTaxa() - taxa);
           // setTaxa(getTaxa() - taxa);

        }

