import java.util.Scanner;

public class Exercio03
 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in); // 'Entrada' sera utilizada para ler o teclado

        String nome; //variavel para ler o nome digitado
        double salario; //variavel Salario
        double aumento; // variavel Aumento

        System.out.println("Digite o seu Nome:");
        nome = entrada.nextLine(); //Leitura da String digitada pelo usuario

        System.out.println("Digite o seu Salario");
        salario = entrada.nextDouble();
        aumento = (salario + salario *0.25);
        System.out.println(nome + " Salario com Aumento " + aumento);

      entrada.close();
        
    }
}
