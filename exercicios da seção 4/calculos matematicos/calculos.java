// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
// mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.
import java.util.Scanner;



public class calculos {
    public static void main(String[] args) {

        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        double a, b, c, d, e;

        a = (A * C) / 2;

        b = pi * C * C;

        c = (A + B) / 2.0 * C;
		d = B * B;
		e = A * B;

        System.out.printf("TRIANGULO: %.3f%n", a);
		System.out.printf("CIRCULO: %.3f%n", b);
		System.out.printf("TRAPEZIO: %.3f%n", c);
		System.out.printf("QUADRADO: %.3f%n", d);
		System.out.printf("RETANGULO: %.3f%n", e);


        sc.close();
    }    
}
