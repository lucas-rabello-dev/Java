// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Soma_simples {
    public static void main(String[] args) {

        int num, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();

        int soma = num + num2;

        System.out.printf("A soma de %d e %d é igual a: %d \n", num, num2, soma);

        sc.close();
    }
}