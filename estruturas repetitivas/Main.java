public class Main{
    public static void main(String[] args) {

        int num = 10; 

        // exemplo while
        while (num != 0) {
            System.out.println(num);
            num--;
        }
        
    
        // exemplo for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // exemplo do while
        int num2 = 10;
        do {
            int contagem = 0;
            if (contagem <= 10) {
                contagem++;
                num2--;
            }


        } while(num2 >= 0);

        System.out.println("fim do programa");
    }
}