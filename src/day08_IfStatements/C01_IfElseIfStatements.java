package day08_IfStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz");
        String gun= scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gun.equals("Sali")) {
            System.out.println("Sal");
        } else if (gun.equals("çarşamba")) {
            System.out.println("Çar");
        } else if (gun.equals("Perşembe")) {
        System.out.println("Per");
        } else if (gun.equals("Cuma")) {
        System.out.println("Cum");
        } else if (gun.equals("Cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("Pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Lütfen geçerli bir gün ismi yazınız");
        }

    }
}
