package com.example;

enum TiposVeiculosEnum {
    CARRO(4), 
    CAMINHAO(6), 
    MOTO(2);

    private final Integer numeroRodas;

    private TiposVeiculosEnum(Integer numeroRodas){
        this.numeroRodas = numeroRodas;
    }

    public Integer getNumeroRodas(){
        return this.numeroRodas;
    }
}
