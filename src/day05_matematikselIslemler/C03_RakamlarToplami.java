package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 Basamaklı Bir Sayı Giriniz Lütfen");

        int sayi= scan.nextInt();  //5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        // Şuanda sayı 5267 bb=0, rt=0
        birlerBasamagi= sayi %10;
        rakamlarToplami+=birlerBasamagi;
        sayi/= 10;
        // şuanda sayi=526 bb=7,  rt=7

        birlerBasamagi= sayi %10; // sayi 526   bb=6
        rakamlarToplami+=birlerBasamagi;  // rt=7+6=13
        sayi/= 10;
        // şuanda sayi=52 bb=6,  rt=13

        birlerBasamagi= sayi %10; // sayi 52  bb=2
        rakamlarToplami+=birlerBasamagi;  // rt=7+6+2=15
        sayi/= 10;
        // şuanda sayi=5 bb=2,  rt=15

        birlerBasamagi= sayi %10; // sayi 5  bb=5
        rakamlarToplami+=birlerBasamagi;  // rt=7+6+2+5=20
        sayi/= 10;
        // şuanda sayi=0 bb=5,  rt=20

        System.out.println(ilkGirilenSayi+ "  sayının rakamlar toplamı :  " +rakamlarToplami);


    }
}
