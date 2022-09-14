package day04_dataCasting;

import java.util.Scanner;

public class d09_dataCasting {
    public static void main(String[] args) {

    // Kullanıcıdan 3 basamaklı bir sayi girmesini isteyiniz, bu sayının rakamları toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<100 || sayi>999) {
            System.out.println("Lütfen girdiğiniz sayinin 3 basamaklı olduğundan emin olun");
        } else {
            int birler=sayi%10;
            int sayi1=sayi/10;
            int onlar=sayi1%10;
            int yuzler=sayi1/10;
            System.out.println("Sayınızın rakamları toplamı : "+(birler+onlar+yuzler));
        }




    }
}
