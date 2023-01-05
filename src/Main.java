import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armut = 2.17, domates = 1.11, elma = 3.67, muz = 0.95, patlican = 5.0,
                armutKg, domatesKg, elmaKg, muzKg, patlicanKg, total;

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = scanner.nextDouble();

        total = (armut * armutKg) + (domates * domatesKg) + (elma * elmaKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.print("Toplam tutarınız : " + total + " TL");


    }
}
