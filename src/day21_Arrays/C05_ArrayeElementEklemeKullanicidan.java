package day21_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayeElementEklemeKullanicidan {
    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String [] sinifListesi= {"Ali", "Can", "Nida", "Yucedal", "Musa", "Veli", "Yaman"};

        sinifListesi= elemanEkle1(sinifListesi);

        System.out.println(Arrays.toString(sinifListesi));


    }

    private static String[] elemanEkle1(String[] siniflistesi) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Listeye kaç tane ekleme yapmak istiyorsunuz");
        int eklenecekAdedi=scan.nextInt();
        String[] yeniSinifListesi=new String[siniflistesi.length+eklenecekAdedi];

        for (int i = 0; i < siniflistesi.length ; i++) {
            yeniSinifListesi[i]=siniflistesi[i];
        }

        for (int i = 1; i <=eklenecekAdedi ; i++) {
            System.out.println(i+". ekleyeceğiniz ismi giriniz");
            yeniSinifListesi[siniflistesi.length-1+i]= scan.next();

        }
        return yeniSinifListesi;
    }
}
