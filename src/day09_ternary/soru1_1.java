package day09_ternary;

import java.util.Scanner;

public class soru1_1 {
    public static void main(String[] args) {

        System.out.println("Bir tam sayi girin daaa");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        String cikti=((sayi>=0&& sayi<10))?("Sayiniz rakamdir"):(((sayi<100)||(sayi<=-10&&sayi>=-99))?
                ("sayiniz iki basamaklidir"):("sayiniz uc basamakli veya daha büyük bir sayidir"));
        System.out.println(cikti);
    }
}
