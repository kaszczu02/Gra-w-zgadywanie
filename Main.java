import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int upper, a = 1, s = 1;
        char komunikat;
        try {
            upper = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Blednie podane dane");
            return;
        }

        if (upper < 0) {
            System.out.println("Blednie podane dane");
            return;
        }

        int random = rand.nextInt(upper);
        while (true) {
            System.out.println("Podaj liczbe");
            try {
                a = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Blednie podane dane");
                s++;
                sc.nextLine();
                continue;
            }
            if (a > upper || a < 0) {
                System.out.println("Blednie podane dane");
                s++;
                continue;
            }
            if (a > random) {
                System.out.println("Liczba jest za duza");
                s++;
            } else if (a < random) {
                System.out.println("Liczba jest za mala");
                s++;
            } else {
                System.out.println("Zgadles !");
                System.out.println("Liczba prob: " + s);
                s = 0;
                System.out.println("Czy chcesz kontynuować?");
                komunikat = sc.next().charAt(0);
                if (komunikat == 'n' || komunikat == 'N') {
                    break;
                }

                if (komunikat == 't' || komunikat == 'T') {
                    random = rand.nextInt(upper);
                }
                if (komunikat != 'n' && komunikat != 'N' && komunikat != 't' && komunikat != 'T') {
                    System.out.println("Blednie podane dane");
                    return;
                }

            }

        }
    }
}