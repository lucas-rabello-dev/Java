
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 palavras e um número no final: ");
        String x, y, z;
        int a;

        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();
        a = sc.nextInt();

        // pode acontecer de ter algum problema no buffer que pode ser resolvido usando apenas 
        // um .nextLine() solto
        // nesse caso isso poderia acontecer
        // a = sc.nextInt();
        // x = sc.nextLine();
        // y = sc.nextLine();
        // z = sc.nextLine();

        System.out.printf("Você digitou: %s, %s, %s, %d", x, y, z, a);

    }
}
