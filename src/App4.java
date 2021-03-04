import java.util.Scanner;

public class App4 {
    
    public static void main(String[] args) {
        
        //variaves razão, primeiro termo e numero de termos
        Scanner sc = new Scanner(System.in);

        int r,a1,n;
        int an = 0, soma = 0;

        r = sc.nextInt();
        a1 = sc.nextInt();
        n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            an = a1 + ((i-1)*r);
            soma = soma + an;
            System.out.printf("%d ", an);

        }
        System.out.println("Soma: "+ soma);
    }
}
