import java.util.Scanner;

public class App7 {
    
    public static void main(String[] args) {
        
        //m linhas e n colunas
        Scanner sc = new Scanner(System.in);
        int n,m;

        //chamar variaveis
        System.out.println("Numero de linhas ");
        n = sc.nextInt();
        System.out.println("Numero de colunas ");
        m = sc.nextInt();

        int matriz[][] = new int[m][n];
        int matriz2[][] = new int[m][n];
        
        System.out.println("Matriz 1");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz 2");
        for(int a = 0; a<n; a++){
            for(int b = 0; b<m; b++){
                matriz2[a][b] = sc.nextInt();
            }
        }
        
        //printando
        System.out.println("Imprimindo as matrizes");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.printf("%d", matriz[i][j]);
            }
        }

        for(int a = 0; a<n; a++){
            for(int b = 0; b<m; b++){
                System.out.printf("%d", matriz2[a][b]);
            }
        }

    }
}
