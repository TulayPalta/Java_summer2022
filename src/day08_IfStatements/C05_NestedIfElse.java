package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen şifre giriniz");
        String sifre= scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z') {

            if ( ilkHarf=='A') {
                System.out.println("geçerli şifre");
            } else {
                System.out.println("geçersiz şifre");
            }

        } else if ( ilkHarf>='a' && ilkHarf<='z') {

            if ( ilkHarf=='z') {
                System.out.println("geçerli şifre");
            } else {
                System.out.println("geçersiz şifre");
            }

        } else {
            System.out.println("Lütfen ilk karakter için sadece harf kullanın");
        }




    }
}
