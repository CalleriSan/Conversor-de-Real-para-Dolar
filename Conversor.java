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
                    ConversorRealDolar(Real, Dolar);
                    JOptionPane.showMessageDialog(null, "Você tem US$" + Dolar);
                    break;
                case 2:
                    ConversorDolarReal(Real, Dolar);
                    JOptionPane.showMessageDialog(null, "Você tem R$" + Real);
                    break:
                 case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog("INVALIDO");
            }
        }
        public Double ConversorRealDolar(Real, Dolar) {
            Real = Double.parseDouble(JOptionPane.showInputDialog("Quantos Reais você tem? "));
            conversor = Real / 5.28;
            Dolar = conversor;
            return Dolar;
        }
        public double ConversorDolarReal(Real, Dolar) {
            Dolar = Double.parseDouble(JOptionPane.showInputDialog("Quantos Dolares você tem? "));
            conversor = Dolar * 5.28;
            Real = conversor;
            return Real;
        }
    }
}
