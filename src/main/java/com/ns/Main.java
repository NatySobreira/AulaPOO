package com.ns;


import com.ns.abstracts.Conta;
import com.ns.classes.ContaFisica;
import com.ns.classes.ContaJuridica;

public class Main {
    public static void main(String[] args) {
        ContaFisica contaFisica = new ContaFisica("RG007", "Nat");
       // System.out.println("Hello world!");

        contaFisica.deposita(7000.00);
        contaFisica.saca(2000.00);

        ContaFisica contaFabio = new ContaFisica("RG005", "Fabio");
        ContaJuridica contaJuridica = new ContaJuridica();

        contaJuridica.deposita( 1000000.00);
        contaJuridica.setNomeCliente("Sobreira Solutions");

       /* String banco = contaJuridica.BANCO;
        banco = "Itaú";*/
        System.out.println("O banco é:"+ contaJuridica.BANCO);

    }
}