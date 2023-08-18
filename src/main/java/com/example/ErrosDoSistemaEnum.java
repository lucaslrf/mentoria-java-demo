package com.example;

enum ErrosDoSistemaEnum {
    EXCEPTION_ACESSO_BANCO(0, "Houve um erro ao acessar o banco");

    private final Integer numeroRodas;
    private final String mensagem;

    private ErrosDoSistemaEnum(Integer numeroRodas, String mensagem){
        this.numeroRodas = numeroRodas;
        this.mensagem = mensagem;
    }

    public Integer getNumeroRodas(){
        return this.numeroRodas;
    } 

    public String getMensagem(){
        return this.mensagem;
    } 
}
