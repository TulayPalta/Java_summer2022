package day10_stringManipulation;

import java.util.Scanner;

public class Odev_ArtikYil2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil%100==0) {
            if (yil%400==0) {
                System.out.println("Artik yil");
            } else {
                System.out.println("Artik yil değil");
            }

        } else {
            if (yil%4==0) {
                System.out.println("Artik yil");
            } else {
                System.out.println("Artik yil değil");
            }
        }




    }

}
