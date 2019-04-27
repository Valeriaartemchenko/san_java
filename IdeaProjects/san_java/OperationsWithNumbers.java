import java.util.Scanner;

public class OperationsWithNumbers {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        boolean runLoopAgain = true;
        while (runLoopAgain){
            System.out.println("Poproszę wpisać pierwszą liczbę:");
            float a = scan.nextFloat();
            System.out.println("Poproszę wpisać drugą liczbę:");
            float b = scan.nextFloat();
            System.out.println("Wpiście wybraną operację: 1 dla dodawania, 2 - odejmowania, 3 - iloczynu, 4 - ilorazu");
            int operation = scan.nextInt();
            switch (operation) {
                case 1:
                    float c = a + b;
                    System.out.println("Summa a i b równia się " + c);
                    break;
                case 2:
                    float d = a - b;
                    System.out.println("Różnica - " + d);
                    break;
                case 3:
                    float e = a * b;
                    System.out.println("Iloczyn - " + e);
                    break;
                case 4:
                    if (b != 0){
                    float f = a / b;
                    System.out.println("Iloraz - " + f);}
                    else {
                        System.out.println("Musisz wpisać wartośc odminą od zera");
                    }
                    break;
            }
            System.out.println("Chcesz sprobować znów (1 - tak/0 -nie)");
            int userInput = scan.nextInt();
            if (userInput == 1) {
                runLoopAgain = true;
            }  else {
                runLoopAgain = false;
            }
        }
    }
}
