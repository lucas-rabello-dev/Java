
public class Math {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = java.lang.Math.sqrt(x);
        B = java.lang.Math.sqrt(y);
        C = java.lang.Math.sqrt(25.0);
        System.out.printf("Raiz de %.2f = %.2f \n", x, A);
        System.out.printf("Raiz de %.2f = %.2f \n", y, B);
        System.out.printf("Raiz de 25 = %.2f \n", C);

        double teste1 = java.lang.Math.pow(2, 3); // potência 2^3
        double teste2 = java.lang.Math.abs(z); // valor absoluto (se for negativo fica positivo)
        System.out.println(teste1 + " | " + teste2); 


    }
}
