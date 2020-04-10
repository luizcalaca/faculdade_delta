public class MyClass {
    public static void main(String args[]) {
    
        //int[] vetor = new int[] {1,2,3,4,5,6,7,8,9} -- vetor
        
        double A[][] = { {1,2,3}, {0,1,3}, {0,0,-1} }; //matriz
        
        //Matriz 3X3
        //Primeira coluna índice - 0
        //1 2 3 - primeira linha índice 0
        //0 1 3 - segunda linha índice 1
        //0 0 -1 -terceira linha índice 2
        
        //System.out.println(A[0][0]); //primeira linha e primeira coluna
        //System.out.println(A[0][1]); //primeira linha e segunda coluna
        //System.out.println(A[0][2]); //primeira linha e terceira coluna
        
        for(int i=0; i<A.length; i++){ //repita para as linhas
            System.out.println();
            for(int j=0; j<A.length; j++){ //repita para as colunas
                System.out.print(A[i][j]);
            }
        }
        
    }
}
