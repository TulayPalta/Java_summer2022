package day10_stringManipulation;

import java.util.Scanner;

public class Odev_ArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 ==0) {
                    System.out.println("Artik Yil");
                } else {
                    System.out.println("Artik Yil Degil");
                }

            } else {
                System.out.println("Artik Yil");
            }

        } else {
            System.out.println("Artik Yil Degil");
        }
    }
}
