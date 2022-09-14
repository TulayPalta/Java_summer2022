package day09_ternary;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        // kullanıcıda bir sayı gir 10 dan küçükse "Rakam" 100 den küçükse "iki basamaklı sayı"değise"üç basamaklı
        // veya daha büyük sayı"
        // yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi=scan.nextInt();

        String sonuc= (sayi <10 && sayi >= 0) ? ("Rakam") :
                ((sayi>=10 && sayi<100) ? "İki Basamaklı Sayı" : "üç basamaklı veya daha büyük sayı");

        System.out.println(sonuc);

    }
}
