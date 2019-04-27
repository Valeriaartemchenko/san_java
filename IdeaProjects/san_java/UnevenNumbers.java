
import java.util.Scanner;

public class UnevenNumbers {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in); //adding a scanner
        System.out.println("Proszę wpisać liczbę od!");
        int a = scan.nextInt();
        System.out.println("Proszę wpisać liczbę do ");
        int b = scan.nextInt();
        for(int i = a; i < b; i++) {
            if (i % 2 != 0){   // остаток от деления, если осток от деления на два не равно нулю то значит число нечетное
                System.out.print(i + " ");
            }
        }

    }
}
