package day07_IfStatements;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
       /* Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
         birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        “Eskenar degil”
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        int kenar1=scan.nextInt();
        System.out.println("2.kenarı giriniz");
        int kenar2=scan.nextInt();
        System.out.println("3.kenarı giriniz");
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar3==kenar2){
            System.out.println("eskenar üçgendir");
        } else{
            System.out.println("eskenar üçgen degil");
        }




    }
}
