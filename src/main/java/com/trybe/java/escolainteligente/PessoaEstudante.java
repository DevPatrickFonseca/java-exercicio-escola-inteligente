package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  private String nome;
  private int anos;
  private int meses;
  private int dias;

  /**
   * Construtor.
   */
  public PessoaEstudante(String nome, int anos, int meses, int dias) {
    this.nome = nome;
    this.anos = anos;
    this.meses = meses;
    this.dias = dias;
  }

  public PessoaEstudante() {
  }

  /**
   * Getters e Setters.
   */
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnos() {
    return anos;
  }

  public void setAnos(int anos) {
    this.anos = anos;
  }

  public int getMeses() {
    return meses;
  }

  public void setMeses(int meses) {
    this.meses = meses;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int idadeEmDias = 0;

    idadeEmDias += anos * 365;
    idadeEmDias += meses * 30;
    idadeEmDias += dias;

    return idadeEmDias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do estudante:");
    String nome = scanner.nextLine();

    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.print("anos: ");
    int anos = scanner.nextInt();
    System.out.print("meses: ");
    int meses = scanner.nextInt();
    System.out.print("dias: ");
    int dias = scanner.nextInt();

    int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
    System.out.println("███████████████████████████████████");
    System.out.println("A idade de " + nome + " em dias é: " + idadeEmDias);
    System.out.println("███████████████████████████████████");

    scanner.close();
  }
}