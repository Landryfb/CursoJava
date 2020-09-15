import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, contpar = 0, contimpar = 0;
        int i = 1;

        while ( i <= 7) {
            System.out.println(" Digita o " + i + "numero");
            num = entrada.nextInt();
            if (num % 2 == 0) {
                contpar++;
                
            }
            if (num % 2 == 1) {
                contimpar++;
                
            }
            i++;
        }
         System.out.println("Foram Digitados " + contpar + " numeros pares");
         System.out.println("Foram Digitados " + contimpar + " numeros Impares");

         entrada.close();
    }
    
}
