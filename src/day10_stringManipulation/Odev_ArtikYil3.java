package day10_stringManipulation;

import java.util.Scanner;

public class Odev_ArtikYil3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil%4==0 && yil%100!=0 || yil%400==0) {
            System.out.println("Artik Yil");

        } else {
            System.out.println("Artik Yil Değil");
        }


    }
}
