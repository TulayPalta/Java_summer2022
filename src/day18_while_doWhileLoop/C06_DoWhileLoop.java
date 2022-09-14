package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
    /* Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
    islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate
    almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve girdigi pozitif
    sayilarin toplaminin kac oldugunu yazdirin. */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayacPozitif=0;
        int sayacNegatif=0;
        int toplam=0;
        do {
            System.out.println("Lütfen bir sayı giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                toplam+=sayi;
                sayacPozitif++;
            } else if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;
            }
        } while (sayi!=0);
        System.out.println("Girdiğiniz sayıların \n"+sayacNegatif+" tanesi negatiftir. "
                +sayacPozitif+" tanesi pozitiftir. \ngirdiğiniz pozitif sayıların toplamı : "
                +toplam);

    }//main end
}
