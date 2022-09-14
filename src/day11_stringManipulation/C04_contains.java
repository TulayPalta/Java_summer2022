package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {
       /* Kullanicidan bir cumle isteyin.
       Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
       “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
        */

        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();

        // requirements'de buyuk harf kucuk harf hassasiyeti hakkında bir sey soylenmemis.
        // ikinci olarak da her iki kelimeyi de içerme durumu açıklanmamış.
        // Bu durumda görevi verene sormak gerekir.

        // ek requirements: ikisini de içeriyorsa "karar ver büyük mü yazdırayım, küçük mü?
        // case sensitive olmasın

        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("karar ver büyük mü yazdırayım, küçük mü?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}
