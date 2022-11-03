package com.hiago.aula9;

import java.util.*;
public class Classe1
{   public static int contador = 0;
    public static int diminuir = 20;
     
  // método subrotina processar  
  public static void processar ( int ciclos )
  {
       while (contador < ciclos)
       {
           contador ++;   // contador = contador + 1;
           diminuir -= 5; // diminuir = diminuir -5;
       }
  }
 
 
  public static void main ( String args[] )
    {
        int  item, numero;
        Scanner leitor = new Scanner(System.in);
        do {
              System.out.println("***Menu ***");
              System.out.println("\n1 Executar...\n2 Sair \n item:");
              item = leitor.nextInt();
              switch (item)
              {
                  case 1 -> {
                      System.out.println("\nDigite o Número de Ciclos:");
                      numero = leitor.nextInt();
                      processar ( numero );
                      System.out.println("\nContador=" + contador);
                      System.out.println("\nDminuir=" + diminuir);
                }
                  case 2 -> System.exit(0);
              }
                       
           } while (true);
    }}