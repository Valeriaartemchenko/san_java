import java.util.Scanner;
public class AddingNumbers {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean runLoopAgain = true;
        while (runLoopAgain){
            System.out.println("Poproszę podać pierwszą liczbę");

            while(!scan.hasNextInt()) {
                scan.next();
                System.out.println("Wprowadziłeś litery zamiast liczb,sprobój ponownie");
            }//проверка на буквы

            float a = scan.nextFloat();
            System.out.println("Poproszę podać drugą liczbę");

            while(!scan.hasNextInt()) {
                scan.next();
                System.out.println("Wprowadziłeś litery zamiast liczb,sprobój ponownie");
            }//проверка на буквы

            float b = scan.nextFloat();
            float result = a;

            if (a > b) {
                System.out.println("Druga liczba nie może być mniejsza od pierwszej");
            } else {
                for (float i = a+1; i <= b; i++){
                    if (result > 100){
                        break;
                    }
                    result = result + i;
                }

                System.out.println("Summa będzie " + result);
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
/*
1. Вводим два числа
2. Второе должно быть больше
3. Отнимаем эти два числа и вычисляем количество ходов
4. Начинаем добавлять от а все числа пока оно не будет больше или равно 100
Можно сделать с помощью break;


int iterations_count = b - a + 1;
        int limit = 100;
        for (int i = a; i <= iterations_count; i++){
            a = a + i+1;
            if (a >= limit){
                break;
            }
        }
 */