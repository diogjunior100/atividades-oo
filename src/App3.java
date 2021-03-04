import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        
        //circulo, triangulo e quadrado
        //calcular perimetro
        Scanner sc = new Scanner(System.in);

        int l1,l2,l3,l4;
        int somat;
        int somaq;

        System.out.println("Informe a figura geometrica: ");
        String figura = sc.next();

        if(figura == "triangulo"){
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            l3 = sc.nextInt();

            somat = l1+l2+l3;
            System.out.println(somat);
            
        }

        else if(figura == "quadrado"){
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            l3 = sc.nextInt();
            l4 = sc.nextInt();
            somat = l1+l2+l3+l4;
            System.out.println(somat);

        }

        else if(figura == "circulo"){


        }
        

        
    }
}
