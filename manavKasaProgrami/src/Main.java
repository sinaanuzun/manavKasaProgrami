import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 4.95, Patlican = 5.0,
                armut, elma, domates, muz, patlican, toplamTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("\t********* MANAVIMIZA HOŞGELDİNİZ *********");
        System.out.println("\t\t\tArmutun KG fiyatı:    2.14 TL\n" +
                "\t\t\tElmanın KG fiyatı:    3.67 TL\n" +
                "\t\t\tDomatesin KG fiyatı:  1.11 TL\n" +
                "\t\t\tMuzun KG fiyatı:      4.95 TL\n" +
                "\t\t\tPatlıcanın KG fiyatı: 5 TL\n");


        System.out.println();

        System.out.print("Kaç KG Armut almak istiyorsunuz : ");
        armut = scanner.nextDouble();

        System.out.print("Kaç KG Elma almak istiyorsunuz : ");
        elma = scanner.nextDouble();

        System.out.print("Kaç KG Domates almak istiyorsunuz : ");
        domates = scanner.nextDouble();

        System.out.print("Kaç KG Muz almak istiyorsunuz : ");
        muz = scanner.nextDouble();

        System.out.print("Kaç KG Patlıcan almak istiyorsunuz : ");
        patlican = scanner.nextDouble();


        toplamTutar = (armut*Armut) + (elma*Elma) + (domates*Domates) +
                (muz*Muz) + (patlican*Patlican);
        System.out.println();
        System.out.print("******** "+"Toplam Tutar: " + toplamTutar + " TL"+ " ********");
        System.out.println();
    }
}