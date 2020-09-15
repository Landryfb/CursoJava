public class Exemplo02
{
   public static void main(String[] args) 
   {
       System.out.println("1 + 2"); // Escreve na Linha " e apenas texto
       System.out.println(1 + 2); // Sem as " considera a soma
       System.out.println("1 + 2 = " + 1 + 2); // Quando tive um sinal + ele contenar com a esquerda
       System.out.println("1 + 2 = " + (1 + 2)); // Operadore Matematico + - /
       System.out.println(2 + 3 * 5);
       System.out.println((2 + 3) * 5); //Lembra sempre que estiver entre () sera a primeira execução
       System.out.println(2 + 3 * 5); // Alt + Shift + seta : Duplica linha; CTRL +F5:RUN; 
       System.out.println(10 / 2);
       System.out.println(11 / 2); // Dessa nao consegue efetuar a divisão correta
       System.out.println(11.0 / 2); // para numeros não inteiros .0
   } 
}
