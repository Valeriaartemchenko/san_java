import java.util.Scanner;

public class NumbersConversion {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int insertedNUmber = scan.nextInt();
        System.out.println("2: "+  Integer.toBinaryString(insertedNUmber));
        System.out.println("8: " + Integer.toOctalString(insertedNUmber));
        String hex = Integer.toHexString(insertedNUmber);
        System.out.println("16: " + hex);
        int hexNumber = Integer.parseInt(hex, 16);
        float odwrotnaLiczba = 1 / hexNumber;
        System.out.println(odwrotnaLiczba);
    }

}
