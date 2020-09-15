import java.util.Scanner;

import sun.jvm.hotspot.tools.SysPropsDumper;



public class Exercicio1005
{
public static void main(final String[] args)
{
    final Scanner entrada = new Scanner(System.in);

    int numero1;
    int numero2;
       
    System.out.println("Digite o Primerio Numero: ");
    numero1 = entrada.nextInt();
    System.out.println("Digite o Primerio Numero: ");
    numero2 = entrada.nextInt();
   
    if (numero1 > numero2){
        System.out.println(" Ordem Decrescente, " +numero1 + " Proximo " +numero2);
    }else {
        System.out.println(" Ordem Decrescente, " +numero2 + " Proximo " +numero1);
    }
    
        
    

    entrada.close();


}

}
    

