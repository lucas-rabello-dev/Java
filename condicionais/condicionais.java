import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {
        // condicionais if, else if e else
        // int x = 5;
        // int y = 66;

        // // resultado: false
        // // o primeiro é verdadeiro e o segundo é falso
        // if (x != y && 5 > y) {
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }

        /*
         Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direto
         a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
         custa R$ 2,00. Fazer um programa para ler a quantidade de minutos que uma pessoa
         consumiu, daí mostrar o valor a ser pago.
         */

        Scanner sc = new Scanner(System.in);

        int time;
        System.out.print("Digite o número de minutos que você ficou no telefone nesta ligação: ");
        time = sc.nextInt();

        int contador = time - 100;

        double result = 50;
        if (time <= 100 && contador <= 0) {
            System.out.printf("Você precisa pagar apenas R$ %.2f\n", result);
        } else if (time > 100 && contador != 0) {
            result += contador * 2;
            System.err.printf("Você precisa pagar R$ %.2f \n", result);
        }

        sc.close();
    }
}