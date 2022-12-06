import java.util.Scanner;
import javax.swing.*;

public class Zad8plus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double qty = 0;

        Object[] options = {"JPY", "PLN", "Cancel"};

        JOptionPane.showMessageDialog(null, "Witamy w kantorze!");

        int answer = JOptionPane.showOptionDialog(null, "Wybierz walute", "Kantor 'Scammer'", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (answer != (JOptionPane.CANCEL_OPTION)) {
            qty = Double.parseDouble(JOptionPane.showInputDialog(null, "Wprowadz kwote", 100));
            if (qty <= 0) {
                JOptionPane.showMessageDialog(null, "Nieprawidlowa wartosc");
            } else {
                switch (answer) {
                    case 0:
                        JOptionPane.showMessageDialog(null, (double)Math.round(qty*100)/100 + "¥ => " + (double)Math.round(qty/30.28*100)/100 + " zl");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, (double)Math.round(qty*100)/100 + "zl => " + (double)Math.round(qty*30.28*100)/100 + " ¥");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Blad! Sprobuj ponownie");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operacja anulowana");
        }
    }
}