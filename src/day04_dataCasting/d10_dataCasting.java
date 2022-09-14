package day04_dataCasting;

import java.util.Scanner;

public class d10_dataCasting {
    public static void main(String[] args) {
        // 10) Girilen zamanı saniyeye çeviren bir program yazınız
        // örn: 1 saat 10 dakika 50 saniye = 4250 saniye

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaç saat istediğinizi giriniz");
        int saat = scanner.nextInt();
        System.out.println("Lütfen kaç dakika istediğinizi giriniz");
        int dakika = scanner.nextInt();
        System.out.println("Lütfen kaç saniye istediğinizi giriniz");
        int saniye = scanner.nextInt();

        System.out.println(saat*3600+dakika*60+saniye);





    }
}
