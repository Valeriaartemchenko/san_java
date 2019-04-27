import java.util.Scanner;

public class Loop_1 {
    public static void main (String[] args){
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= b; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
/*

import java.util.Scanner;

class Loop_1 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}*/