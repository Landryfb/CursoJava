import java.util.Scanner;

public class Exercicio1007 {
    public static void main(String[] args)
     {
        Scanner Scanner in = new Scanner(System.in);
        double salario;
      System.out.println("Digite o seu Salario: ");
      salario = in.nextDouble();
      
      if (salario <= 600.00) 
      {
          System.out.println("Peao Isento");
      }else{
          if (salario <= 1200.00) {
              System.out.println("Peao paga 20%");
              
          }
      }
        in.close();
    }

}
