package com.ns.classes;

import com.ns.abstracts.Conta;

public class ContaFisica extends Conta {
    public ContaFisica(String documento, String nomeCliente) {
        super(documento, nomeCliente);
    }

    @Override
    public double deposita(double valor) {
        return 0;
    }

    @Override
    public double saca(double valor) {
        return 0;
    }
}
