import java.util.Scanner;

public class Funkcja {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a, b, x, y;
        System.out.println("Poproszę wprowadzić wartość argumentu a");
        a = scan.nextInt();
        System.out.println("Poproszę wprowadzić wartość argumentu b");
        b = scan.nextInt();
        for (x = 0; x <= 10; x++){
            y = a*x + b;
            System.out.println("Przy x = " + x + " funkcja y = " + y);
        }

    }
}
