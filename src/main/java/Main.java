
// Gabriel Kienen e Luciano Zumach

import java.util.Scanner;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Mensagem inicial para o usuário
      System.out.println("Bem-vindo à Calculadora!");
      System.out.println("Escolha uma operação digitando o número correspondente:");
      System.out.println("1 - Adição");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Sair");
      System.out.println("Digite um número de 1 a 5 para iniciar.");

      while (true) {
          System.out.print("Escolha uma operação: ");

          int escolha = scanner.nextInt();

          // Verifica se o usuário escolheu sair
          if (escolha == 5) {
              System.out.println("Saindo da calculadora...");
              break;
          }

          // Verifica se a escolha é válida
          if (escolha < 1 || escolha > 5) {
              System.out.println("Opção inválida! Tente novamente.");
              continue; // Volta para o início do loop
          }

          System.out.print("Digite o primeiro número: ");
          double num1 = scanner.nextDouble();

          System.out.print("Digite o segundo número: ");
          double num2 = scanner.nextDouble();

          double resultado = 0;
          boolean calculado = true;

          switch (escolha) {
              case 1:
                  resultado = num1 + num2;
                  break;
              case 2:
                  resultado = num1 - num2;
                  break;
              case 3:
                  resultado = num1 * num2;
                  break;
              case 4:
                  if (num2 == 0) {
                      System.out.println("Erro: Divisão por zero!");
                      calculado = false;
                  } else {
                      resultado = num1 / num2;
                  }
                  break;
          }

          if (calculado) {
              System.out.println("Resultado: " + resultado);
          }
      }

      scanner.close();
  }
}