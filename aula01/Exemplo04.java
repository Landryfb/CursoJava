import java.util.Scanner;

public class Exemplo04 
{
    public static void main(String[] args) // Inicio do Programa
    {
        Scanner entrada = new Scanner(System.in); // 'Entrada' sera utilizada para ler o teclado
        String nome; //variavel para ler o nome digitado
        int idade; //variavel para armazenar idade


        System.out.println("Digite o seu Nome:");
        nome = entrada.nextLine(); //Leitura da String digitada pelo usuario

        System.out.println("Digite sua Idade");
        idade = entrada.nextInt();

        System.out.println(" Olá " + nome + " voce tem " + idade + " anos. "); // Entrada via Teclado

        System.out.println("Olá  " + nome);

        entrada.close();


    }

}
