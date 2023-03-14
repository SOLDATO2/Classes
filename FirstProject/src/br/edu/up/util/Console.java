package br.edu.up.util;

public class Console {
    
    // funçao que usa o metodo de print para printar apenas strings.
    public static void imprimir(String mensagem){
        System.out.println(mensagem);
    }

    // função que le uma string x, printa a string e converte a string para um decimal no return.
    public static double lerDecimal(String x){
        System.out.println(x);
        return Double.parseDouble(x);
    }
}
