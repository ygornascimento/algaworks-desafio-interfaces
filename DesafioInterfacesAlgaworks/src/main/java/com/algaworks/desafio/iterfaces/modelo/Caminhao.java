package com.algaworks.desafio.iterfaces.modelo;

public class Caminhao  extends VeiculoAutomotor {
    private int quantidadeEixos;
    private static final int VALOR_POR_EIXO = 50;
    private static final double PORCENTO_SOBRE_VALOR_MERCADO = 0.2;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }


    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * PORCENTO_SOBRE_VALOR_MERCADO) + (getQuantidadeEixos() * VALOR_POR_EIXO);
    }

    @Override
    public String descrever() {
        return String.format("Caminhão modelo: %s ano %d, %d eixos " +
                "avaliado em: R$%.2f %nPrêmio: R$%.2f", getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado(), calcularValorPremio());
    }
}
