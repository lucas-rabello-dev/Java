public class Calculos {
    public static void main(String[] args) {
        int h = 5;
        int b = 6;
        int B = 8;
        // (b + B)
        // -------x h
        //    2

        double result = ((b + B) / 2) * h;
        // ou (b + B) / 2.0 * h
        System.out.println(result);

        // -----------------------------------------------

        int a, b2;
        double resultado;
        a = 5;
        b2 = 2;
        // casting = conversão explicita de valores
        resultado = (double) a / b2; // aqui o resultado sai como 2.5
        double resultado2 = a / b2; // aqui o resultado sai como 2.0

        System.out.printf("%.2f  %.2f", resultado, resultado2);
    }
}
