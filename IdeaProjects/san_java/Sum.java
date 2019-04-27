import java.util.Scanner;

 public class Sum {
     public static void main(String[] args) {
         Scanner  scan = new Scanner(System.in);
         System.out.println("A = ");
         int a = scan.nextInt();
         System.out.println("B =");
         int b = scan.nextInt();

         System.out.printf("A + B" + (a + b ));
     }
}
