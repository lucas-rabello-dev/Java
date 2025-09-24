// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valorPorHora;

        System.out.print("Digite seu ID de funcionário: ");
        numFuncionario = sc.nextInt();

        System.out.print("Digite sua quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que você recebe por hora: ");
        valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora; 

        System.out.printf("Seu salário é de %.2f \n", salario);


        sc.close();
    }    
}
