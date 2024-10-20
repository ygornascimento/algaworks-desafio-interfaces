package com.algaworks.desafio.iterfaces.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        if (getAnoFabricacao() < 2000) {
            return (getValorMercado() * 0.4) * 0.5;
        } else {
            return getValorMercado() * 0.4;
        }
    }

    @Override
    public String descrever() {
        return String.format("Carro Particular modelo: %s ano %d , " +
                "avaliado em: R$%.2f %nPrêmio: R$%.2f", getModelo(), getAnoFabricacao(), getValorMercado(), calcularValorPremio());
    }
}
