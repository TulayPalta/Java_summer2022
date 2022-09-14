package day04_dataCasting;

import java.util.Scanner;

public class d11_Scanner {
    public static void main(String[] args) {
        // 11) Kullanıcıdan isim, soyisim ve kart bilgilerini isteyiniz.
        // Konsola Sayın Tülay Palta 1234 **** **** **12 numaralı kartınıza ait borç bilgisi bulunmamaktadır.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen kredi kartı numaranızı aralarında boşluk olmadan giriniz");
        String krediKarti=scan.nextLine();

        if (krediKarti.length()==16) {
            String ilkDort=krediKarti.substring(0,4);
            String soniki=krediKarti.substring(krediKarti.length()-2);
            System.out.println("Sayın "+isim+" "+ilkDort+" **** **** **"+soniki+" " +"numaralı kartınıza ait borç bilgisi bulunmamaktadır.");
        } else {
            System.out.println("Lütfen kredi kart numaranızı 16 haneli olarak girdiğinizden emin olunuz");
        }

        //         String direk=kkarti.replace(kkarti.substring(4,14), " **** **** **");
        //        System.out.println(direk);

    }
}
