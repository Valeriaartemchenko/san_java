import java.util.Scanner;

public class Array10na10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        boolean runLoopAgain = true;
        int [][] array = new int [10][10];
        int sum = 0;

        while (runLoopAgain){
            System.out.println("Jeśli chcesz przekątną z lewa na prawo - wpisz 1, jeśli z prawa na lewo - wpisz 2");
            int direction = scan.nextInt();
            switch (direction) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
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
                    System.out.println("Suma równia się " + sum);
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            array[i][j] = 0;
                            System.out.print(array[i][j] + "\t");
                        }
                        for(int k = 0; k == array.length; k = k+10){
                            array[i][k] = (int) (Math.random() * 30);
                            System.out.print(array[i][k] + "\t");
                        }
                        System.out.println(" ");
                    }

                    break;
            }
                //повтор программы
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

