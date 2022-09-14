package day09_ternary;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi%2==0 ? "çift sayı" : "tek sayı");

    }
}
