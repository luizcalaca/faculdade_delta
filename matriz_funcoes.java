public class MyClass {
    
    //somatório de todos os elementos desta matriz //total = 9
    public static void main(String args[]) {

        double A[][] = { {1,2,3}, {0,1,3}, {0,0,-1} }; //matriz
        System.out.println("A soma dos elementos é: " + soma(A) );
    
    }
    
    public static double soma(double A[][]){
        double soma = 0;
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                //soma = soma + A[i][j];
                soma += A[i][j]; //acumulador
            }
        }
        
    return soma;
    }

}
