package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {

        int[] arr={5,7,8,10};
        int sayi=5;

        elemanDegistir(arr, sayi);
        System.out.println(Arrays.toString(arr));
        System.out.println(sayi);
    }

    public static void elemanDegistir(int[] arr , int sayi) {
        Random rnd = new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        sayi++;
        System.out.println(sayi);

    }

}
