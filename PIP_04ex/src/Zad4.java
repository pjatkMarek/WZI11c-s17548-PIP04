import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Podaj dwie liczby oraz operację do wykonania:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Podaj akcje do przeprowadzenia:");
        String action = scan2.nextLine();

        switch (action) {
            case "add":
                add(x, y);
                break;
            case "sub":
                sub(x, y);
                break;
            case "div":
                div(x, y);
                break;
            case "mul":
                mul(x, y);
                break;
            default:
                System.out.println("Brak takiej operacji");
        }
    }
    public static void add(int x, int y) {
        System.out.println("Wynik: " + (x+y));
    }
    public static void sub(int x, int y) {
        System.out.println("Wynik: " + (x-y));
    }
    public static void div(int x, int y) {
        System.out.println("Wynik: " + (x/y));
    }
    public static void mul(int x, int y) {
        System.out.println("Wynik: " + (x*y));
    }
}