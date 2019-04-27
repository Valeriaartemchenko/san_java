import java.util.Scanner;

public class Figures {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        final double Pi = 3.1415926536;
        System.out.println("Wpiście wybraną figure: 1 dla kwadratu, 2 - prostokąt, 3 - koło, 4 - trójkąt, 5- walec");
        int figure = scan.nextInt();
        switch (figure) {
            case 1:
                System.out.println("Wprowadź wartość strony kwadratu");
                int stronaKwadratu = scan.nextInt();
                int obwodKwadratu = stronaKwadratu * 4;
                if (stronaKwadratu <=0 ){
                    System.out.println("Poproszę wpisać dodatnią wartość");
                } else {
                    System.out.println("Obwód kwadratu równia się " + obwodKwadratu);
                    double poleKwadratu = Math.pow(stronaKwadratu, 2);
                    System.out.println("Pole kwadratu równia się " + poleKwadratu);
                }
                break;
            case 2:
                System.out.println("Wprowadź wartość  1 strony");
                int stronaProstokatu1 = scan.nextInt();
                System.out.println("Wprowadź wartość  2 strony");
                int stronaProstokatu2 = scan.nextInt();
                if (stronaProstokatu1 <= 0 || stronaProstokatu2 <= 0 ){
                    System.out.println("Poproszę wpisać dodatnią wartość");
                } else {
                    int obwodProstokatu = stronaProstokatu1 * 2 + stronaProstokatu2 * 2;
                    System.out.println("Obwód prostokątu równia się " + obwodProstokatu);
                    int poleProstokatu = stronaProstokatu1 * stronaProstokatu2;
                    System.out.println("Pole prostokątu równia się " + poleProstokatu);
                }
                break;
            case 3:
                System.out.println("Wprowadź radius koła");
                int radius = scan.nextInt();
               // final double Pi = 3.1415926536; // Константа Pi с типом данных для чисел c плавающей точкой
                if (radius<=0){
                    System.out.println("Poproszę wpisać dodatnią wartość");
                } else {
                    double obwodKola = 2 * Pi * radius;
                    System.out.println("Obwód koła równia się " + obwodKola);
                    double poleKola = Pi * Math.pow(radius,2);
                    System.out.println("Pole koła równia się " + poleKola);
                }
                break;
            case 4:
                System.out.println("Wprowadź pierwszą strone");
                int pierwszaStrona = scan.nextInt();
                System.out.println("Wprowadź drugą strone");
                int drugaStrona = scan.nextInt();
                System.out.println("Wprowadź trzecią strone");
                int treciaStrona = scan.nextInt();
                if (pierwszaStrona <=0 || drugaStrona <=0 || treciaStrona <= 0) {
                    System.out.println("Poproszę wpisać dodatnią wartość");
                } else {
                    int obwodTrojkata = pierwszaStrona + drugaStrona + treciaStrona;
                    System.out.println("Obwód trojkątu równia się " + obwodTrojkata);
                    double polowaObwodu = obwodTrojkata / 2;
                    double poleTrojkata = Math.sqrt(polowaObwodu * (polowaObwodu - pierwszaStrona) * (polowaObwodu - drugaStrona) * (polowaObwodu - treciaStrona));
                    System.out.println("Pole trojkątu równia się " + poleTrojkata);
                }
                break;
            case 5:
                System.out.println("Wprowadż radius walca");
                int radiusWalca = scan.nextInt();
                System.out.println("Wprowadż wysokość walca");
                int wysokoscWalca = scan.nextInt();
                if (radiusWalca <= 0 || wysokoscWalca <=0) {
                    System.out.println("Poproszę wpisać dodatnią wartość");
                } else {
                    double poleWalca = 2 * Pi * radiusWalca* (wysokoscWalca+radiusWalca);
                    System.out.println("Pole walca równa się " + poleWalca);
                    double objentoscWalca = Pi * Math.pow(radiusWalca, 2) * wysokoscWalca;
                    System.out.println("Objentość walca "+ objentoscWalca);
                }
        }
    }
}
