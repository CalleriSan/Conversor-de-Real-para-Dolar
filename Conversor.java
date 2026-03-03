import javax.swing.JOptionPane;
public class Conversor {
    public static void main(String[] args) {
        double Real;
        double Dolar;
        int menu;

        while(menu != 9) {
            menu = Int.parseInt(JOptionPane.showInputDialog("1- converter real pra dolar \n 2- converter dolar pra real \n"));

            switch(menu) {
                case 1:
                    ConversorRealDolar();
                    JOptionPane.showMessageDialog(null, "Você tem US$" + Dolar);
                    break;
            }
        }
        public Double ConversorRealDolar(Real, Dolar) {
            Real = Double.parseDouble(JOptionPane.showInputDialog("Quantos Reais você tem? "));
            conversor = Real * 5.28;
            Dolar = conversor;
            return Dolar;
        }
    }
}
