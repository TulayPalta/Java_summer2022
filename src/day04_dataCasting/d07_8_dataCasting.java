package day04_dataCasting;

import java.util.Scanner;

public class d07_8_dataCasting {
    public static void main(String[] args) {

       /* Data Casting: Veri Sınıfı Değiştirme
        Veri tiplerinde bir variable’a oluşturulduğu data tipinden farklı bir değer atanmasıdır.
        Data sınırlarına dikkat edilmelidir. byte<short<int<long<float<double
        short Data Type:-32.768 den 32.767’e (dahil) tamsayilar icin kullanilabilir.

        1)	Auto Widening (Otomatik Genişletme)
        -	Dar veri tipinden daha geniş veri tipine geçmemiz gerektiğinde Java küçükten büyüğe dönüşümü
        otomatik yapar. (Büyüğe çevirir)
        2)	Explicit Narrowing (Manuel Daraltma)
        -	Java büyükten küçüğe dönüşümü otomatik yapmaz, sorumluluğu bize bırakır.
        Değişkenin önüne parantez içinde hangi tipe dönüştüğümüzü yazmamız gerekir.
                -	Bu durumda narrowing casting veri kaybına sebep olabilir.  */

        // 6) Kullanicidan Float bir deger girmesini isteyin, bu sayıyı short değişken tipine dönüştürün.
        // 7) Kullanici tarafından girilen double sayıyı tam sayıya çeviren bir program yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfer n Float bir sayi giriniz");
        float sayi1=scan.nextFloat();
        System.out.println((short)sayi1);

        System.out.println("Lütfen double bir sayi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println((int)sayi2);




    }
}
