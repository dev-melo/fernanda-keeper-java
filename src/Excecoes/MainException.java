package Excecoes;

import POO.Carro;

public class MainException
{
    public static void main(String[] args)
    {
        Carro meuErrodeCarro = null;
        try{
            meuErrodeCarro.acelerar();

        } catch (NullPointerException e){
            System.out.println("vender carro ruim: " +  e.getCause());
        }

    }
}
