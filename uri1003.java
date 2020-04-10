//https://www.urionlinejudge.com.br/judge/pt/problems/view/1003

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
       
      int A;
      int B;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o primeiro valor: ");
      A = sc.nextInt();
      
      System.out.println("Digite o segundo valor: ");
      B = sc.nextInt();
      
      int soma = A + B;
      
      System.out.println("SOMA = " + soma );
    }
}

