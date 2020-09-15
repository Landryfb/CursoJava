import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) 
    {
        Scanner ent = new Scanner(System.in);

        int num , maior = 0, menor = 4;
        int contaMaior = 0, contMenor = 0;

        for(int i = 0; i < 4; i++) { 
            System.out.println("Digite um numero de 0 e 4");
            num = ent.nextInt();
            if ((num < 1) || (num > 4))
             {
                i = i - 1;                
            }else {
                if (num > maior) 
                {
                   maior = num;
                   contaMaior++; 
                }
                if (num < menor) 
                {
                    menor = num;
                    contMenor++;
                }

            }

        }
        System.out.println(" O Maior numero digita foi " + maior);
        System.out.println(" O Maior numero digita foi " + menor);

        ent.close();
    }

}
