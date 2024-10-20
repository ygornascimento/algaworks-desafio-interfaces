package com.algaworks.desafio.iterfaces;

import com.algaworks.desafio.iterfaces.modelo.Caminhao;
import com.algaworks.desafio.iterfaces.modelo.CarroParticular;
import com.algaworks.desafio.iterfaces.modelo.ImovelResidencial;
import com.algaworks.desafio.iterfaces.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000, 320);
        CarroParticular carroParticular = new CarroParticular("Versa", 56_000, 2017);
        Caminhao caminhao = new Caminhao("TRUCK", 1_500_000, 2001, 6);

        servicoPropostaSeguro.emitir(imovelResidencial);
        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);

    }
}
