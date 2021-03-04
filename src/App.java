import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nome");
        String nome = sc.next();

        System.out.println("Informe seu ano de nascimento");
        int a = sc.nextInt();

        int idade = 2021 - a;



        System.out.println("Ola "+ nome + " Você tem " + idade);
        
        

    }
}
