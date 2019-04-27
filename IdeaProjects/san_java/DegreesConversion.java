import java.util.Scanner;

public class DegreesConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 359;

        /*
        int c = a%b
        функция ниже делает то же самое
         */
        int c = Math.floorMod(a, b);
        System.out.println(c);



    }
}
