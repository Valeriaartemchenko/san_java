import java.util.Scanner;

public class RandomNumber {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 9;
        int randomNumber = a + (int)(Math.random() * b);
        System.out.println("Wpisz swoją liczbę");
        boolean runLoopAgain = true;
        while (runLoopAgain){
        int usersNumber = scan.nextInt();
        //System.out.print(randomNumber);//just for check

        if (usersNumber==randomNumber){
            System.out.println("Zgadałeś, to była liczba " + randomNumber);
            runLoopAgain = false;
        } else {
            System.out.println("Nie zgadałeś");
            System.out.println("Chcesz sprobować znów (1 - tak/0 -nie)");//добавила вопрос хочет ли пользователь
            int userInput = scan.nextInt();
            if (userInput == 1) {
                runLoopAgain = true;
            }  else {
                runLoopAgain = false;
            }
            //runLoopAgain = true;
            if (randomNumber>4){
                System.out.println("Liczba jest większa od 4");
            } else {
                System.out.println("Liczba jest mniejsza od 4");
            }
        }
    }
 }
}
