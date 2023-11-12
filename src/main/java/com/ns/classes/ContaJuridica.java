package com.ns.classes;

import com.ns.Interfaces.ContaCEF;
import com.ns.abstracts.ContaBancaria;

public class ContaJuridica extends ContaBancaria implements ContaCEF {

    @Override
    public double deposita(double valor) {
        if (valor > 0){
            double novoSaldo = super.getSaldo() + valor;
            super.setSaldo(novoSaldo);
        }
        return super.getSaldo();
    }

    @Override
    public double saca(double valor) {
        return 0;
    }

    @Override
    public double consultaSaldo() {
        return 0;
    }
}
