import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("Digite o número do dia da semana: ");
        input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("O dia da semana é domingo!");
                break;
            case 2:
                System.out.println("O dia da semana é segunda!");
                break;
            case 3:
                System.out.println("O dia da semana é terça!");
                break;
            case 4:
                System.out.println("O dia da semana é quarta!");
                break;
            case 5:
                System.out.println("O dia da semana é quinta!");
                break;
            case 6:
                System.out.println("O dia da semana é sexta!");
                break;
            case 7:
                System.out.println("O dia da semana é sábado!");
                break;
            default:
                System.out.println("Opção de número inválida!");
        }

        sc.close();
    }
}
