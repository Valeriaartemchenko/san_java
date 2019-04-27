import java.util.Scanner;
//import java.util.Arrays;

public class matrixSimple {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean runLoopAgain = true;
        int[][] numbers = new int[10][10];
        int sum = 0;


        while (runLoopAgain) {
            for (int[] row: numbers){
                System.out.println(" ");
                for (int element: row){

                    System.out.print(element + "\t");
                }
            }

            //это обычная петля
            /*for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = 0;
                    if (i == j) { // если индексы равны значит число где-то в диагонали
                        array[i][j] = (int) (Math.random() * 30);// тут можно поменять диапазон рандомных чисел
                        if (array[i][j] != 0) { //проверяем число равно ли оно нулю,
                            sum = sum + array[i][j]; //если нет то прибавляем в сумму
                        }

                    }
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println(" ");
            }
            */


            System.out.println("Suma równia się " + sum);
            System.out.println("Średnia równia się "+ sum/10);
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
