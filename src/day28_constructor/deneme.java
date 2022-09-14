package day28_constructor;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        int a= scan.nextInt();
        System.out.println("Dikdortgenin uzun kenarini giriniz");
        int b= scan.nextInt();

        System.out.println("Alan: "+(a*b));
        System.out.println("Cevre: "+(a+b)*2);
    }
}