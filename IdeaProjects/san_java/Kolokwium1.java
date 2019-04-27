import java.util.Scanner;

public class Kolokwium1 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Poproszę podać pierwszą liczbę");
        int firstNumber = scan.nextInt();

        System.out.println("Proszę wpisać liczbę do ");
        int secondNumber = scan.nextInt();

        int i = firstNumber;
        int sum = 0;

        while (i <= secondNumber){
            if (i % 2 != 0){   // остаток от деления, если осток от деления на два не равно нулю то значит число нечетное
                //System.out.print(i + " ");
                sum += i;
            }
            i++;

        }
        System.out.println(sum);
        }
    }

