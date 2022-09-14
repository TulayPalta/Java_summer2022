package day09_ternary;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        /* Kullanıcıdan S D E T harflerinden birini yazmasını isteyin,
        kullanıcı S girerse software
        D girerse Developer
        E girerse Engineer
        T girerse intesting
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen S D E T harflerinden birini giriniz");
        char harf=scan.next().charAt(0);

        switch (harf) {
            case 'S':
            case 's':
                System.out.println("software");
                break;
            case 'D':
            case 'd':
                System.out.println("Developer");
                break;
            case 'E':
            case 'e':
                System.out.println("Engineer");
                break;
            case 'T':
            case 't':
                System.out.println("intesting");
                break;
            default:
                System.out.println("lütfen geçerli bir harf giriniz");

        }







    }
}
