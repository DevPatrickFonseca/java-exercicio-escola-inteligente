package com.trybe.java.escolainteligente;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Portaria {

  private Portaria() {
  }

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int totalPessoas = qtdFundamental1 + qtdFundamental2 + qtdMedio;

    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat df = new DecimalFormat("#.0#", symbols);

    double percentualFundamental1 = (qtdFundamental1 * 100.0) / totalPessoas;
    double percentualFundamental2 = (qtdFundamental2 * 100.0) / totalPessoas;
    double percentualMedio = (qtdMedio * 100.0) / totalPessoas;

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + df.format(percentualFundamental1) + "%");
    System.out.println("Ensino Fundamental II: " + df.format(percentualFundamental2) + "%");
    System.out.println("Ensino Médio: " + df.format(percentualMedio) + "%");
    System.out.println();
    System.out.println("TOTAL: " + totalPessoas);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> idades = new ArrayList<>();

    short opcao = 0;
    do {
      System.out.println("Digite o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");
      opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Informe a idade da pessoa estudante:");
        int idade = scanner.nextInt();
        idades.add(idade);
        String categoria = verificarCategoria(idade);
        System.out.println(" ");
        System.out.print("█ ");
        System.out.print("Pessoa estudante do " + categoria + ", catraca liberada!");
        System.out.println(" █");
        System.out.println(" ");
      } else if (opcao != 2) {
        System.out.println("Entre com uma opção válida!");
      }
    } while (opcao != 2);

    int qtdFundamental1 = 0;
    int qtdFundamental2 = 0;
    int qtdMedio = 0;

    for (int idade : idades) {
      String categoria = verificarCategoria(idade);

      switch (categoria) {
        case "Ensino Fundamental I":
          qtdFundamental1++;
          break;
        case "Ensino Fundamental II":
          qtdFundamental2++;
          break;
        case "Ensino Médio":
          qtdMedio++;
          break;
        default:
          System.out.println("Categoria desconhecida: " + categoria);
          break;
      }
    }

    emitirRelatorio(qtdFundamental1, qtdFundamental2, qtdMedio);

    scanner.close();
  }

  /**
   * Método verificarCategoria.
   */
  public static String verificarCategoria(int idade) {
    if (idade <= 10) {
      return "Ensino Fundamental I";
    } else if (idade >= 15) {
      return "Ensino Fundamental II";
    } else {
      return "Ensino Médio";
    }
  }
}
