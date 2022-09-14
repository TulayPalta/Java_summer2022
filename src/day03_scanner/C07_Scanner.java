package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi, soyisminizi ve yaşınızı giriniz, \naralarda enter tuşuna basınız");

        String isim= scan.nextLine();
        String Soyisim = scan.nextLine();
        int yas = scan.nextInt();

        System.out.println("girilen bilgiler ="+isim+" "+Soyisim+" - "+yas);

    }
}
