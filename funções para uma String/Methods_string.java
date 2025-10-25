public class Methods_string {
    public static void main(String[] args) {
        String original = "Lucas Rabello          ";

        System.out.printf("Original: %s\n", original + "-");
        System.out.println("Sem letras maiúsculas: " + original.toLowerCase() + "-");
        System.out.println("Todas as letras maiusculas: " + original.toUpperCase() + "-");
        System.out.println("Eliminando os espaços no final da String: " + original.trim() + "-" + " o (-) marca o final");
        System.out.println("Pega o caractere 2 em diante da string: " + original.substring(2));
        System.out.println("Pega o caractere 6 até o 8 da string: " + original.substring(6, 8));
        System.out.println("Pega o caractere 'a' e substitui por 'p': " + original.replace('a', 'p'));

        int index = original.indexOf("Rabello");
        int lastIndex = original.lastIndexOf("Rabello");
        System.out.println("Index de 'Rabello': " + index);
        System.out.println("Last Index de 'Rabello': " + lastIndex);


        // Operação split
        // o string.split() -> recebe como parametro um separador entre as palavras e retorna um vetor de cada palavra
        String sla = "banana maçã uva";
        String[] vetor = sla.split(" "); // separador definido como 'espaço'

        for (int i = 0; i < vetor.length ; i++){
            System.out.println(vetor[i]);
        }


    }
}
