import java.util.Scanner;

public class Funcs{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, num3;

        num = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println("O valor mais alto é: " + max(num, num2, num3));

        sc.close();
    }
    public static int max(int num, int num2, int num3){
        int maior;
            if (num > num2 && num > num3) {
                maior = num;
            } else if (num2 > num3) {
                maior = num2;
            } else {
                maior = num3;
            }
            return maior;
    }
}
