package day07_IfStatements;

import java.util.Scanner;

public class Odev6_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2= scan.nextInt();

        if (sayi1>0 && sayi2>0) {
            System.out.println("sayıların toplamı : " +( sayi1+sayi2));

        } else if (sayi1<0 && sayi2<0) {
            System.out.println("sayıların çarpımı : " + sayi1*sayi2);

        } else if (sayi1==0 || sayi2==0) {
            System.out.println("sıfır çarpmaya göre yutan elamandır");
        } else {
            System.out.println("farklı isaretlerde sayılarla işlem yapamazsın");
        }



    }
}
