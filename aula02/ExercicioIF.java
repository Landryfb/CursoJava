import java.util.Scanner;

public class ExercicioIF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numero;
        float resultado;

        System.out.println("Digite o Numero: ");
        numero = in.nextFloat();

        if (numero >= 20) {
            resultado = (float)numero / 2; // casting - conversão de tipo float
            System.out.println(" O numero e: " + resultado);
        }
        in.close();

    }
}
