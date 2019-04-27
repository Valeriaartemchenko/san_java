import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        boolean runLoopAgain = true;

        while (runLoopAgain){
            System.out.println("Jeśli chcesz obliczyć wylosowane liczby wpisz 1, jeśli podać samodzielnie wpisz 2");
            while(!scan.hasNextInt()) scan.next();//проверка на буквы
            byte choise = scan.nextByte();
            if (choise == 1){
                System.out.println("Ile liczb będzie w zbiorze?");
                while(!scan.hasNextInt()) scan.next();//проверка на буквы
                int number = scan.nextInt(); // тут мы вписываем какую длину массива мы хотим

                if (number >= 1 && number <= 100){
                    int [] array1 = new int[number]; //задали длину такую как вписал пользователь
                    System.out.println("Array length is  " + array1.length );// это для проверки длины масива

                    for (int i = 0; i < array1.length; i++){
                        array1[i] = (int)(Math.random() * 99);
                        System.out.print(array1[i] + " ");
                    }
                    System.out.println(" ");//Добавляет пустую строку
                    //тут начинается алгоритм который вычисляет наименьшее и наибольшее число в массиве
                    int max = array1[array1.length - 1];
                    int min = array1[array1.length - 1];
                    for (int i=0; i < array1.length; i++) {
                        if (array1[i] > max) {
                            max = array1[i];
                        } else if (array1[i] < min) {
                            min = array1[i];
                        }
                    }

                    System.out.println("Min: " + min);
                    System.out.println("Max: " + max);

                    // Среднее арифметическое

                    if (array1.length > 0)
                    {
                        double sum = 0;
                        for (int j = 0; j < array1.length; j++) {
                            sum += array1[j];
                        }
                        double average = sum / array1.length;
                        System.out.println("Average number is " + average);
                    }


                } else if (number <= 0){
                    System.out.println("Ilość musi być dodatnia lub większa od zera");
                } else {
                    System.out.println("Ilość nie może przekrącać 100");
                }
            } else if (choise == 2){
                System.out.println("Ile liczb będzie w zbiorze?");
                while(!scan.hasNextInt()) scan.next();//проверка на буквы
                int number = scan.nextInt(); // тут мы вписываем какую длину массива мы хотим
                int [] array1 = new int[number];
                System.out.println("Array length is  " + array1.length );// это для проверки длины масива
                System.out.println("Input the numbers into your array");
                for (int i = 0; i < array1.length; i++) {

                    array1[i]= scan.nextInt(); //Заполняем массив элементами введенными с клавиатуры
                }
                System.out.print ("Inserted array elements:");
                for (int i = 0; i < array1.length; i++) {
                    System.out.print (" " + array1[i]); // Выводим на экран, полученный массив
                }
                System.out.println(" ");//Добавляет пустую строку
                //тут начинается алгоритм который вычисляет наименьшее и наибольшее число в массиве
                int max = array1[array1.length - 1];
                int min = array1[array1.length - 1];
                for (int i=0; i < array1.length; i++) {
                    if (array1[i] > max) {
                        max = array1[i];
                    } else if (array1[i] < min) {
                        min = array1[i];
                    }
                }
                System.out.println("Min: " + min);
                System.out.println("Max: " + max);

                // Среднее арифметическое

                if (array1.length > 0)
                {
                    double sum = 0;
                    for (int j = 0; j < array1.length; j++) {
                        sum += array1[j];
                    }
                    double average = sum / array1.length;
                    System.out.println("Average number is " + average);
                }


            } else {
                System.out.println("Wpisaleś niepoprawne dane");
            }
            //Повторная попытка
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
1. Спросить хочу ли я сама ввести число, или чтобы оно само намешало
Это скорее всего сделать через
 */