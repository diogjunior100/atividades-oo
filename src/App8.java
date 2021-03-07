import java.util.Scanner;

public class App8 {
    
    public static void somarMatrizes(int m, int n, int[][] matriz, int[][] matriz2) {
        int resultado[][] = new int[m][n];

        if(m == n){
         for(int i = 0; i<n; i++){
             for(int j = 0; j<m; j++){
                resultado[i][j] = matriz[i][j]+matriz2[i][j];
            }
          }
          
        //printando
         System.out.println("Imprimindo o resultado");
         for(int i = 0; i<n; i++){
             for(int j = 0; j<m; j++){
                 System.out.printf("%d ", resultado[i][j]);
             }
             System.out.println();
         }
        }

        else{
            System.out.println("Nao pode realizar a soma, pois m eh diferente de n");
        } 
        
    }

    public static void main(String[] args) {
        
         //m linhas e n colunas
         Scanner sc = new Scanner(System.in);
         int n,m;
 
         //chamar variaveis
         //System.out.println("Numero de linhas ");
         //n = sc.nextInt();
         //System.out.println("Numero de colunas ");
         //m = sc.nextInt();
 
         int matriz[][] = new int[2][3];
         int matriz2[][] = new int[2][3];
         
         //System.out.println(+ m + " " + n);
         System.out.println("Matriz 1");
         for(int i = 0; i<2; i++){
             for(int j = 0; j<3; j++){
                 matriz[i][j] = sc.nextInt();
             }
         }
 
         System.out.println("Matriz 2");
         for(int a = 0; a<2; a++){
             for(int b = 0; b<3; b++){
                 matriz2[a][b] = sc.nextInt();
             }
         }

        somarMatrizes(2,3, matriz, matriz2);

        
    }
}
