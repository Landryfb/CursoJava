import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);

        String senha;
       
  
        
           System.out.println("Digite a senha:");
           senha = input.nextLine();
  
           if ( senha != "teste")
           {
             System.out.printf("ACESSO NEGADO\n");
                num++;
            }
           } while ( senha == "teste");
              System.out.printf("ACESSO PERMITIDO\n");
              System.out.printf("A senha errada foi informada %s vez(es)", num);
        
        
    }
    
}
