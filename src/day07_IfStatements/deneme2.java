package day07_IfStatements;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir ay giriniz");
        String ay=scan.next().toLowerCase();

        if (ay.equals("ocak") || ay.equals("subat") || ay.equals("mart")
                ||  ay.equals(" nisan")  ||  ay.equals(" mayıs") || ay.equals("haziran")){
            System.out.println("Şanslısınız");}
        else if (ay.equals("  temmuz")|| ay.equals("agustos")
        || ay.equals("eylül")|| ay.equals("ekim")|| ay.equals("kasım")|| ay.equals("aralık")) {
            System.out.println("Şanslı değilsiniz");}
        else {
            System.out.println("lütfen doğru bir ay girdiğinizden emin olunuz");}


        }

    }

