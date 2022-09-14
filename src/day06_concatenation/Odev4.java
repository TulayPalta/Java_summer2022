package day06_concatenation;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {

       /* Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        olmadigini yazdirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dikey kenarı giriniz");
        int dikeyKenar=scan.nextInt();
        System.out.println("lütfen yatay kenarı giriniz");
        int yatayKenar=scan.nextInt();

        if (dikeyKenar == yatayKenar) {
            System.out.println("Bu bir karedir");
        } else {
            System.out.println("Bu bir dikdörtgendir");
        }




        }
    }


