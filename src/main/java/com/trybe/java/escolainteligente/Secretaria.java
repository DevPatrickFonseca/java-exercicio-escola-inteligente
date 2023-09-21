package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Secretaria {

  private Secretaria() {
  }

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double somaNotas = (nota1 + nota2 + nota3 + nota4);
    double media;
    media = somaNotas / 4;

    return media;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o nome do estudante?");
    String nome = scanner.nextLine();

    System.out.println("Digite as notas do estudante:");
    System.out.print("Avaliação 1: ");
    float nota1 = scanner.nextFloat();
    System.out.print("Avaliação 2: ");
    float nota2 = scanner.nextFloat();
    System.out.print("Avaliação 3: ");
    float nota3 = scanner.nextFloat();
    System.out.print("Avaliação 4: ");
    float nota4 = scanner.nextFloat();

    double media = calcularMedia(nota1, nota2, nota3, nota4);

    System.out.println("A média das notas de " + nome + " é " + media);

    scanner.close();
  }

}
