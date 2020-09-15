import java.util.Scanner;
 


public class Exercio01 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in); // 'Entrada' sera utilizada para ler o teclado
        String nome; //variavel para ler o nome digitado
        Double nota1; //variavel nota 2
        Double nota2; // variavel nota 2
        double media; // variavel media

        System.out.println("Digite o seu Nome:");
        nome = entrada.nextLine(); //Leitura da String digitada pelo usuario

        System.out.println("Digite sua Primeira Nota");
        nota1 = entrada.nextDouble();
        System.out.println("Digite sua Seguna Nota");   
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) /2;

        System.out.println("Olá Sua Media e " + media);






    }
}
