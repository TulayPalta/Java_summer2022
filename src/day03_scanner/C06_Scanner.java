package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve Soyisminizi Giriniz");
        String adSoyad = scan.nextLine();

        System.out.println("yaşınızı giriniz");
        double yas = scan.nextDouble();

        System.out.println("girilen bilgiler" +adSoyad +yas);

    }
}
