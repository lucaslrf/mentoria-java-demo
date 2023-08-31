package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TiposVeiculosEnum tiposVeiculosEnum = TiposVeiculosEnum.CARRO;
        System.out.println("NUMERO_RODAS: " + tiposVeiculosEnum.getNumeroRodas());        

        ErrosDoSistemaEnum errosDoSistemaEnum = ErrosDoSistemaEnum.EXCEPTION_ACESSO_BANCO;

        /* Exemplo de estrutura de dados em java */
        Integer testeString[] = new Integer[50];
        testeString[0] = 1;

        List<String> list = new ArrayList<String>();
        list.add("TESTE");
        list.add("TESTE");
        list.add("TESTE");
        list.add("TESTE");

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("MeuAtributo", 0);
    }

    public void funcaoTeste(Short teste) {
        // regra de negocio z
    }

    public void funcaoTeste(Integer teste) {
        // regra de negocio y
    }

    public void funcaoTeste() {
        // regra de negocio x
    }
}
