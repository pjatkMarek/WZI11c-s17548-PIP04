import java.util.Scanner;
import java.lang.Math;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadz 2 liczby rzeczywiste i nacisnij ENTER po kazdej z nich:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if(a > b) {
            a += b;
            b = a - b;
            a -= b;
        }
        System.out.println("Wybrany przedzial: [" + a + ", " + b + "]");

        double x = (double)Math.round((Math.random()*(b - a) + a)*100)/100;
        double y = (double)Math.round((Math.random()*(b - a) + a)*100)/100;
        double z = (double)Math.round((Math.random()*(b - a) + a)*100)/100;

        System.out.println("Wartosci generowane losowo:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if (x > y) {
            if (x > z) {
                if (y > z) {
                    System.out.println("Gdzie: " + z + " < " + y + " < " + x);
                } else {
                    System.out.println("Gdzie: " + y + " < " + z + " < " + x);
                }
            } else {
                System.out.println("Gdzie: " + y + " < " + x + " < " + z);
            }
        } else if (y > z) {
            if (x > z) {
                System.out.println("Gdzie: " + z + " < " + x + " < " + y);
            } else {
                System.out.println("Gdzie: " + x + " < " + z + " < " + y);
            }
        } else {
            System.out.println("Gdzie: " + x + " < " + y + " < " + z);
        }
    }
}