package URI;

import java.util.Scanner;

public class ExercicioURI01 
{
   public static void main(String[] args)
   {
       Scanner entrada = new Scanner(System.in);

       int A,B,C,D;
        System.out.println("Digite um Numero ");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A%2 == 0)

        {
            System.out.println(" Valores Aceitos ");
        }else{
            System.out.println("Valores não Aceitos ");
        }
         entrada.close();
   } 
}
