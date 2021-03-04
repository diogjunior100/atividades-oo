import javax.swing.JOptionPane;

public class App2 {

    public static void main(String[] args) {
        
        String nome;
        nome = JOptionPane.showInputDialog(null, " Seu nome: ");

        String ano;
        ano = JOptionPane.showInputDialog(null, " Seu ano de nascimento: ");
        int num = Integer.parseInt(ano);
        int resultado = 2021 - num;

        JOptionPane.showMessageDialog(null, "Seu nome eh " + nome);
        JOptionPane.showMessageDialog(null, "Sua idade eh " + resultado);

    }
}