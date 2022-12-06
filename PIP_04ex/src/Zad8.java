import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walutę:\n 1 - PLN\n 2 - JPY");
        int act = scan.nextInt();

        if (act != 1 && act != 2) {
            System.out.println("Wybrano niepoprawna walute");
        } else {

            System.out.println("Wprowadz kwote:");
            double qty = (double) Math.round(scan.nextDouble() * 100) / 100;

            if (qty < 0) {
                System.out.println("Nieprawidlowa wartosc");
            } else {
                switch (act) {
                    case 1:
                        System.out.println((double) Math.round(qty * 100) / 100 + "zl => " + (double) Math.round(qty * 30.28 * 100) / 100 + " ¥");
                        break;
                    case 2:
                        System.out.println((double) Math.round(qty * 100) / 100 + "¥ => " + (double) Math.round(qty / 30.28 * 100) / 100 + " zl");
                        break;
                    default:
                        System.out.println("Blad");
                }
            }
        }
    }
}