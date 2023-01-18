package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {
  /**
  * Método Principal.
  */
  public static void main(String[] args) {
    menuPrincipal();
    Scanner scanner = new Scanner(System.in);
    
    short opcao = scanner.nextShort();
    
    ArrayList<Short> menoresDeIdade = new ArrayList<Short>();
    ArrayList<Short> adultos = new ArrayList<Short>();
    ArrayList<Short> idosos = new ArrayList<Short>();

    // https://www.w3schools.com/java/java_arraylist.asp - Podemos adicionar elementos ao ArrayList com o método add()
    
    while (opcao == 1) {
      System.out.println("Entre com a sua idade:");
      short idade = scanner.nextShort();

      if (idade < 18) {
        menoresDeIdade.add(idade);
        System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      } else if (idade >= 18 && idade <= 49) {
        adultos.add(idade);
        System.out.println("Pessoa adulta, catraca liberada!");
      } else {
        idosos.add(idade);
        System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      }

      menuPrincipal();
       
      opcao = scanner.nextShort();
    }
    scanner.close();
    
    if (opcao == 2) {
      float menoresDeIdadeArray = menoresDeIdade.size();
      float adultosArray = adultos.size();
      float idososArray = idosos.size();
      float totalClientes = (menoresDeIdadeArray + adultosArray + idososArray);
      
      qtdClientes(menoresDeIdadeArray, adultosArray, idososArray);
      percentualClientes(menoresDeIdadeArray, adultosArray, idososArray, totalClientes);
    } else {
      System.out.println("Entre com uma opção válida!");
      menuPrincipal();
    }
  }
  
  private static void qtdClientes(
      float menoresDeIdadeArray, 
      float adultosArray, 
      float idososArray) {
    System.out.println("Quantidade de clientes por categoria");
    System.out.println("menores: " + menoresDeIdadeArray + "\n" + "adultos: "
          + adultosArray + "\n" + "idosos: " + idososArray + "\n");
  }
  
  private static void percentualClientes(
      float menoresDeIdadeArray, 
      float adultosArray, 
      float idososArray,
      float totalClientes) {
    DecimalFormat df = new DecimalFormat("0.0");
    System.out.println("Percentual de clientes por categoria");
    System.out.println("menores: " 
          +  df.format((menoresDeIdadeArray * 100) / totalClientes) + "%" + "\n"
          + "adultos: " + df.format((adultosArray * 100) / totalClientes) + "%" + "\n"
          + "idosos: " + df.format((idososArray * 100) / totalClientes) + "%" + "\n");

    System.out.println("Total de clientes: " + totalClientes);
  }
  
  static void menuPrincipal() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostrar relatório");
  }
}

