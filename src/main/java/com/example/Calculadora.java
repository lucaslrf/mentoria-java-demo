package com.example;

public class Calculadora implements ITeste, IForma {

    @Override
    public void calcularSoma(Integer a, Integer b) {
        System.out.println("SOMA: "+(a+b));
    }

    @Override
    public void calcularSubtracao(Integer a, Integer b) {
        System.out.println("SUBTRACAO: "+(a-b));
    }

    @Override
    public void calcularAngulo() {
        
    }
    
}
