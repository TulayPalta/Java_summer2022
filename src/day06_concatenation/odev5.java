package day06_concatenation;

import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
       /* Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün giriniz");
        String gun=scan.nextLine().toLowerCase();

        if(gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");

        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");

        } else if ( gun.equals("Pazar")) {
            System.out.println("hiristiyanlar icin kutsal gun");
        } else {
            System.out.println("girdiğiniz gün kutsal bir gün değildir");

        }

    }
}
