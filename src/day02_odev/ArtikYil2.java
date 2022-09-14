package aa_examples.day02_odev;

import java.util.Scanner;

public class ArtikYil2 {
    public static void main(String[] args) {


        /*Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        Kural 2: 4 ’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece
        400 ’un kati olan yillar artik yildir*/

                Scanner scan = new Scanner(System.in);
                System.out.println("Lütfen bir yil giriniz");
                int girilenYil = scan.nextInt();

                if (girilenYil%100 == 0) {
                    if (girilenYil%400 == 0) {
                        System.out.println("Artik Yil");
                    } else {
                        System.out.println("Artik Yil Değil");
                    }
                } else {
                    if (girilenYil%4 == 0) {
                        System.out.println("Artik Yil");
                    } else {
                        System.out.println("Artik Yil Değil");
                    }
                }



            }
        }

