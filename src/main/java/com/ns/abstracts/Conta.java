package com.ns.abstracts;

public abstract class Conta {
    private double saldo;
    private String documento;
    private String nomeCliente;
    public abstract double deposita(double valor);
    public abstract double saca(double valor);

    public Conta(String documento, String nomeCliente) {
        this.documento = documento;
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }



}
