
import java.util.Scanner;

public class App5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int r,a1,n,an;

        System.out.println("Informe o primeiro termo ");
        a1 = sc.nextInt();

        System.out.println("Informe a razao ");
        r = sc.nextInt();
        
        System.out.println("Informe a quantidade de termos ");
        n = sc.nextInt();
        int v[] = new int[n];

        for(int i = 1; i<=n; i++){
            an = a1 + ((i-1)*r);
            v[i] = an;
        }

        for(int i = 1; i<=n; i++){
            System.out.println("Esse é o termo " + i + ":" + v[i]);
        }

        
    }
}