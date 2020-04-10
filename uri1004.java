//https://www.urionlinejudge.com.br/judge/pt/problems/view/1004

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
       
       
      int numero1;
      int numero2;
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("Digite o primeiro número: ");
      numero1 = sc.nextInt();
      
      System.out.println("Digite o segundo número: ");
      numero2 = sc.nextInt();
      
      int Prod = numero1 * numero2;
      
      System.out.println("PROD = " + Prod );
    }
}
