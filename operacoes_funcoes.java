import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
      int operacao;
      int A;
      int B;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Qual o operação deseja realizar? 1 - adição, 2 - subtração, 3 - divisão, 4 - multiplicação:");
      operacao = sc.nextInt();
      
      System.out.println("Digite o primeiro valor: ");
      A = sc.nextInt();
      
      System.out.println("Digite o segundo valor: ");
      B = sc.nextInt();
      
      if(operacao == 1){
          System.out.println("A soma é = " + adicao(A,B) );
      }else if(operacao == 2){
          System.out.println("A subtração é = " + subtracao(A,B) );
      }else if(operacao == 3){
          System.out.println("A divisão é = " + divisao(A,B) );
      }else if(operacao == 4){
          System.out.println("A multiplicação é = " + multiplicacao(A,B) );
      }else{
          System.out.println("Não há essa opção");
      }
      
    }
    
    public static int adicao(int A, int B){
        return A + B;
    }
    
    public static int subtracao(int A, int B){
        return A - B;
    }
    
    public static int divisao(int A, int B){
        return A / B;
    }
    
    public static int multiplicacao(int A, int B){
        return A * B;
    }
}
