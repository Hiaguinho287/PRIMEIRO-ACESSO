package com.hiago.aula9;
import java.util.Scanner;

public class Classe3{
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite a quantidade de valores:");
    int qtd = leitor.nextInt();
    
        /*Defindo a lista de números com tamanho n*/
        double numeros[] = new double [ qtd ]; // vetor double com tamanho n
        double saldo =0, valor =0, media =0; int contador = 0;

    while ( contador < qtd ) {
        System.out.println("Digite um valor:");
        numeros [ contador ] = leitor.nextDouble();
        saldo = saldo + numeros [ contador ]; // acumula o valor
        contador = contador + 1; }
        media = saldo / contador; contador=0;
        System.out.println("Os valores são:");
    while (contador < qtd ){
        System.out.println( numeros[contador]); contador ++;}
        System.out.println( String.format("A média é %.2f", media ));}}
