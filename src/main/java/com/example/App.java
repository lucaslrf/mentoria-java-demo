package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {                        
        TiposVeiculosEnum tiposVeiculosEnum = TiposVeiculosEnum.CARRO;
        System.out.println("NUMERO_RODAS: "+tiposVeiculosEnum.getNumeroRodas());

        ErrosDoSistemaEnum errosDoSistemaEnum = ErrosDoSistemaEnum.EXCEPTION_ACESSO_BANCO;
        
        try {
            throw new Throwable(errosDoSistemaEnum.getMensagem());
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
    public void funcaoTeste(Short teste) {
        // regra de negocio z
    }

    public void funcaoTeste(Integer teste){
        // regra de negocio y     
    }

    public void funcaoTeste(){
        // regra de negocio x
    }
}
