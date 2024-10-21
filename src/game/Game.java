package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        
        int tentativas = 0, valorAposta, acumulado = 0, continuar = 1, cont = 0;
        String nomeJogador;
        boolean acertou = false, continuidade;

        System.out.println("Qual seu nome? ");
        nomeJogador = ler.nextLine();
        System.out.println("Deseja iniciar o jogo? true/false ");
        continuidade = ler.nextBoolean();

        if (continuidade) {
            do {
                int numeroSecreto = random.nextInt(100) + 1;
                System.out.println("Bem-vindo ao jogo de adivinhação!");
                System.out.println("Estou pensando em um número entre 1 e 100...");

                System.out.println("Quanto você gostaria de apostar? ");
                valorAposta = ler.nextInt();
                while (!acertou) {
                    System.out.print("Digite sua tentativa: ");
                    int palpite = ler.nextInt();
                    tentativas++;

                    if (palpite < numeroSecreto) {
                        System.out.println("O número é maior!");
                    } else if (palpite > numeroSecreto) {
                        System.out.println("O número é menor!");
                    } else {
                        acertou = true;
                        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                        System.out.println("Toma aqui seu valor dobrado: " + valorAposta * 2);
                        acumulado += valorAposta;
                    }
                }
                acertou=false;
                System.out.println("Deseja jogar novamente(1 para sim e 0 para não? ");
                continuar = ler.nextInt();
                cont++;
            } while (continuar != 0);
        } else {
            System.out.println("Talvez outra hora.");
        }
        System.out.println("Você jogou um total de : " + cont + " vezes.");
        System.out.println("Teve um total de: "+tentativas);
        System.out.println("Obrigado! O valor do prêmio acumulado ficou em: " + acumulado);

        System.exit(0);
    }

}


