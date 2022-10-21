package com.br;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaCorrente extends Conta {
    private double chequeespecial;
    public ContaCorrente(Cliente Cliente) {

        super(Cliente);
    }

    public void setChequeespecial(double chequeespecial) {
        this.chequeespecial = chequeespecial;
    }

    public double getChequeespecial() {
        return chequeespecial;
    }
    public double getSaldoDisponivel(){
        return super.getSaldo() + getChequeespecial();
    }
}