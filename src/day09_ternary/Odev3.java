package day09_ternary;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı girmesini isteyiniz,
        // girilen sayı 10 ise 2 bas. en küçük sayı
        // 100 ise 3 basamaklı en küçük sayı
        // 1000 ise 4 basamaklı en küçük sayı
        // Diğer durumlarda girdiğin sayıyı değiştirin deyin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 10'un pozitif kuvvetleri olan en fazla 4 basamaklı pozitif bir sayi giriniz");
        int Sayi= scan.nextInt();

        switch (Sayi) {
            case 10:
                System.out.println("iki basamaklı en küçük sayı :" + 10);
                break;
            case 100:
                System.out.println("üç basamaklı en küçük sayı :" + 100);
                break;
            case 1000:
                System.out.println("dört basamaklı en küçük sayı :" + 1000);
                break;
            default:
                System.out.println("lütfen girdiğiniz sayıyı değistirin :" );
        }


    }
}
