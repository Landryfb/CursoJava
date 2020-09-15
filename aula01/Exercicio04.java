import java.util.Scanner;

public class Exercicio04 
{
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in); // 'Entrada' sera utilizada para ler o teclado
        
        double salariominimo; //variavel Salario
        double quilowatt; // variavel Aumento
        double valorquilo;
        double consumo;

        System.out.println("Digite o salario mimino de seu estado:");
        salariominimo = entrada.nextDouble(); //Leitura da String digitada pelo usuario

        System.out.println("Digite o seu quilowatt");
        consumo = entrada.nextDouble();

         valorquilo = (salariominimo /500);
         quilowatt = valorquilo *consumo;
         System.out.println(" Valor a Pagar " + quilowatt);

         System.out.println(" valor quilowatt " + valorquilo);
         System.out.println(" Valor a Pagar com Desconto " + (0.85 *quilowatt));

      entrada.close();
    }
     
    

    
    
}
