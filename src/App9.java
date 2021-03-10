import javax.swing.JOptionPane;

public class App9 {
    
    static int a0;
    static int n;
    static int r;
    static int pa[];

    public static void main(String[] args) {

        String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo (a0) do PA: ");
        a0 = Integer.parseInt(strA0);

        String strN = JOptionPane.showInputDialog("Informe o numero de elemntos (n) da PA: ");
        n = Integer.parseInt(strN);

        String strR = JOptionPane.showInputDialog("Informe o numero da razao (r) da PA: ");
        r = Integer.parseInt(strR);

        pa = new int[n];

        int i = 1;
        while(i <= n){
            int termo = a0 + (i-1)*r;
            pa[i-1] = termo;
            i++;
        }

        //imprimir a PA
        String resposta = "[ ";
        i = 0;
        while (i<n){
            resposta += pa[i] + ", ";
            i++;
        }
        resposta += "]";
        JOptionPane.showMessageDialog(null, resposta);


        
    }
}
