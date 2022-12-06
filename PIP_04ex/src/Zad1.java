public class Zad1 {
    public static void main(String[] args) {
        boolean czyPada = false;
        boolean czySwieciSlonce = true;

        if (czyPada == true && czySwieciSlonce == false) {
            System.out.println("plucha");
        } else if (czyPada == true && czySwieciSlonce == true) {
            System.out.println("tecza");
        } else if (czyPada == false && czySwieciSlonce == true) {
            System.out.println("slonecznie");
        } else {
            System.out.println("pochmurno");
        }
    }
}
