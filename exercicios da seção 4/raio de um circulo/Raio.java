// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
/*
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

import java.util.Scanner;

public class Raio { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int area;
        System.out.print("Digite um número: ");
        area = sc.nextInt();

        double pi = 3.14159;

        double raio = pi * (Math.pow(area, 2));

        System.out.printf("o raio do circulo é %.4f \n", raio);



        sc.close();
    }
}
