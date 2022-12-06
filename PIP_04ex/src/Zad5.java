import java.util.Scanner;

public class Zad5 {
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
                System.out.println(absoluteValue(add(x, y)));
                break;
            case "sub":
                System.out.println(absoluteValue(sub(x, y)));
                break;
            case "div":
                System.out.println(absoluteValue(div(x, y)));
                break;
            case "mul":
                System.out.println(absoluteValue(mul(x, y)));
                break;
            default:
                System.out.println("Brak danej operacji");
        }
    }
    public static int add(int x, int y) {
        return x+y;
    }
    public static int sub(int x, int y) {
        return x-y;
    }
    public static int div(int x, int y) {
        return x/y;
    }
    public static int mul(int x, int y) {
        return x*y;
    }

    public static int absoluteValue(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}