package lopes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resposta = "sim";

        do {
            System.out.println("Oi, eu sou a calculadora, que operação você gostaria de fazer?" +
                    "\n (1) Adição" +
                    "\n (2) Subtração" +
                    "\n (3) Multiplicação" +
                    "\n (4) Divisão" +
                    "\n Selecione pelo numero da opção\n");

            int operacao = sc.nextInt();

            // Verifica se a operação é válida
            if (operacao < 1 || operacao > 4) {
                System.out.println("Por favor, selecione 1 a 4.\n");
                continue;
            }

            System.out.println("Digite o primeiro numero da operação:");
            int primeiroNumero = sc.nextInt();

            System.out.println("Digite o segundo numero da operação:");
            int segundoNumero = sc.nextInt();

            int resultado = 0;

            if (operacao == 1) {
                resultado = primeiroNumero + segundoNumero;

            } else if (operacao == 2) {
                resultado = primeiroNumero - segundoNumero;

            } else if (operacao == 3) {
                resultado = primeiroNumero * segundoNumero;

            } else if (operacao == 4) {

                // Evita divisão por zero
                if (segundoNumero == 0) {
                    System.out.println("Não é possível dividir por zero.\n");
                    continue;
                }

                resultado = primeiroNumero / segundoNumero;
            }

            System.out.println("O resultado é: " + resultado + "\n");

            System.out.println("Você quer continuar usando a calculadora? (sim/não):");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Até mais!");

        sc.close();
    }
}