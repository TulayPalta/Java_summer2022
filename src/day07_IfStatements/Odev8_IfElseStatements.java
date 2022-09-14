package day07_IfStatements;

import java.util.Scanner;

public class Odev8_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen teklif veriniz");
        double teklif = scan.nextDouble();

        if (teklif > 80000){
            System.out.println("kabul ediyorum");
        } else if (teklif>=60000){
            System.out.println("konusabiliriz");
        } else {
            System.out.println("Maalesef kabul edemem");
        }



    }
}
