import java.util.Locale;
import java.util.Scanner;

public class Objetos{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // definir o padão do programa para USA
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Digite as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        // formula para calcular a área do triângulo X e Y
        double px = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(px * (px - xA) * (px - xB) * (px - xC));

        double py = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(py * (py - xA) * (py - xB) * (py - xC));

        if (areaX > areaY) {
            System.out.printf("A maior área é X: %.2f \n", areaX);
            System.exit(0);
        }
        System.out.printf("A maior área é Y: %.2f \n", areaY);

        sc.close();
    }
}