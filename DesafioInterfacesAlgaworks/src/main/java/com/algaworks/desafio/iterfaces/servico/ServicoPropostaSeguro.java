package com.algaworks.desafio.iterfaces.servico;

import com.algaworks.desafio.iterfaces.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("------------------------------------------");
        System.out.println("Proposta Seguro");
        System.out.println("------------------------------------------");
        System.out.println(bem.descrever());
    }
}
