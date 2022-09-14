package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayi isteyin
        // sayi pozitifse sayıyı yazdırın
        // sayı sıfır veya negatifse bir sayı daha isteyin ve ikisinin çarpımını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0) {
            System.out.println(sayi);
        } else {
            System.out.println("lütfen bir sayı daha giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

        /* Eğer if else içerisinde yeni kodlar varsa
        ternary ile yapmamız mümkün olmaz
         */


    }
}
