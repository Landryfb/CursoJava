import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma = 0;
        int numero = 1;
        int quantNum = 1;

        while (numero != 0) {
            System.out.println("Digite o " + quantNum + " numero inteiro ( 0 = fim):");
            numero = in.nextInt();
            soma += numero;
            quantNum++;

        }

        System.out.println("soma =" + soma);

        in.close();
    }

}
