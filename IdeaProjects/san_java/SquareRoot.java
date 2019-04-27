import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double d = in.nextDouble();
        double f = Math.sqrt(d);

        if (d > 0) {
            System.out.printf(String.valueOf(f));
        }
        else
            System.out.printf("To nie jest liczba większa od 0");

    }
}