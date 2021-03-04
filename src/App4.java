import java.util.Scanner;

public class App4 {
    
    public static void main(String[] args) {
        
        //variaves razão, primeiro termo e numero de termos
        Scanner sc = new Scanner(System.in);

        int r,a1,n;
        int an;

        r = sc.nextInt();
        a1 = sc.nextInt();
        n = sc.nextInt();

        for(int i = 0; i<=n; i = i + r){
            an = a1 + ((n-1)*r);
            System.out.printf("%d ", an);

        }
    }
}
