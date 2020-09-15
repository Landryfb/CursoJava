import java.util.Scanner;

public class Execicio1004 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;
        float peso1,peso2;pesonota1,pesonota2;

        System.out.println("Digite o Nota1: ");
        nota1 = in.nextFloat();

        System.out.println("Digite o Nota2: ");
        nota2 = in.nextFloat();
        
        pesonota1 = 0.4f;
        pesonota2 = 0.6f;

        peso1 = nota1 = * 0.4;
        peso2 = nota2 = * 0.6;

        media = peso1 + peso2;

        if (media >= 6)
         {
            System.out.println(" Aprovado: " + media);
        }
          else{
              System.out.println(" Reprovado " + media);
          }
        ;
        entrada.close();
       

    }
}
