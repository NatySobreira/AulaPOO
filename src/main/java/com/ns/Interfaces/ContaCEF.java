package com.ns.Interfaces;

public interface ContaCEF {

    String BANCO = "Caixa Econômica Federal";
    abstract double deposita(double valor);
    abstract double saca(double valor);
    abstract double consultaSaldo();
}
