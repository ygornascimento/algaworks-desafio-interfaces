package com.algaworks.desafio.iterfaces.modelo;

public class ImovelResidencial implements BemSeguravel {
    public static final double PORCENTAGEM_SOBRE_VALOR_MERCADO = 0.001;
    public static final double ACRESCIMO_AREA_COSNTRUIDA = 0.30;
    private double valorMercado;
    private double areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (valorMercado * PORCENTAGEM_SOBRE_VALOR_MERCADO) +
                (areaConstruida * ACRESCIMO_AREA_COSNTRUIDA);
    }

    @Override
    public String descrever() {
        return String.format("Imóvel Residencial com %.0fm2 de área construída, " +
                "avaliado em: R$%.2f %nPrêmio: R$%.2f", getAreaConstruida(), getValorMercado(), calcularValorPremio());
    }
}
