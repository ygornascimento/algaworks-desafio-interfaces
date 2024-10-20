package com.algaworks.desafio.iterfaces.modelo;

public class CarroParticular extends VeiculoAutomotor {
    private int anoFabricacao;
    private String modelo;
    private double valorMercado;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public double calcularValorPremio() {
        if (anoFabricacao < 2000) {
            return valorMercado * 0.9;
        } else {
            return valorMercado * 0.4;
        }
    }

    @Override
    public String descrever() {
        return String.format("Carro Particular modelo: %s ano %d , " +
                "avaliado em: R$%.2f %nPrêmio: R$%.2f", getModelo(), getAnoFabricacao(), getValorMercado(), calcularValorPremio());
    }
}
