import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String x;
        System.out.print("Digite alguma coisa: ");
        // x = sc.next(); // para a leitura até encontrar um  " " (espaço)
        x = sc.nextLine(); // faz a leitura até encontrar um \n


        // No caso o input for 2.9 daria erro pois depende do idioma do seu
        // computador, se o idioma estiver em inglês não teria problema
        // para arrumar coloque: 
        // Locale.setDefault(Locale.US);
        // antes do scanner e precisa importar
        double y;
        System.out.print("Digite algum número decimal mano: ");
        y = sc.nextDouble();

        // ler um caractere
        char c;
        // o next lê até achar um espaço e o charAt lê o primeiro indice 
        System.out.print("Digite apenas uma letra: ");
        c = sc.next().charAt(0);


        System.out.printf("Você digitou: %s, %.2f, %c", x, y, c);
        // para finalizar a alocação do objeto
        sc.close();
    }    
}
