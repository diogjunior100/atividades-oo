import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        
        //circulo, triangulo e quadrado
        //calcular perimetro
        Scanner sc = new Scanner(System.in);

        int l1,l2,l3,l4;
        int raio;
        int somat, somaq, somac;


        System.out.println("Informe a figura geometrica: ");
        String figura = sc.next();

        if(figura.equals("triangulo")){
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            l3 = sc.nextInt();

            somat = l1+l2+l3;
            System.out.println("Esse eh o perimetro do triangulo " + somat);
            
        }

        else if(figura.equals("quadrado")){
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            l3 = sc.nextInt();
            l4 = sc.nextInt();
            somaq = l1+l2+l3+l4;
            System.out.println("Esse eh o perimetro do quadrado " + somaq);

        }

        else if(figura.equals("circulo") || figura.equals("CIRCULO")){
            System.out.println("Apresente o raio: ");
            raio = sc.nextInt();
            somac = 2*3*raio;
            System.out.println("Esse eh o perimetro do circulo " + somac);
            

        }
        

        
    }
}
