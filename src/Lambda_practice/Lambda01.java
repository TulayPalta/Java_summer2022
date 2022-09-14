package Lambda_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih","ersin","mevlit"));

    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));

    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.

     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    //1.yol
   public static void aHarfiOlanlariSilenGerisiniYazdiran (ArrayList<String> isimler){

      // System.out.println(isimler.stream().// akışa alındı
       //          map(m -> m.toLowerCase()). // hepsi küçük harfe çevirildi.
       //          filter(m -> !m.contains("a")). // a harfi olmayanlar filtrelendi.
       //        collect(Collectors.toList())); // listeye atıldı

     //2.yol
       System.out.println(isimler.stream(). // akışa alındı
               filter(m -> !m.contains("a") && !m.contains("A")) // a harfi olmayanlar filtrelendi.
               .collect(Collectors.toList())); // Liste atıldı.

       //3.yol
       isimler.removeIf(t->t.contains("a") || t.contains("A"));
       System.out.println(names);

   }

    //en buyuk elemani bulun
    public static void enBuyukElemaniBul(List<Integer> list){

        //1.yol
        System.out.println(list.stream().distinct().reduce(Math::max).get());

        //2.yol
        Integer sayi = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("2.yol = "+ sayi);

        //3.yol
        Optional<Integer> maxSayi= list.stream().reduce(Math::max); //spesifik bir metodla işlem yapılırsa hızlı olur.
        System.out.println("MaxSayi = "+ maxSayi);

        //4.yol
        System.out.println(list.stream().reduce(Integer::max).get());
    }

   // Task : List'teki tum elemanlarin toplamini yazdiriniz.
  //Lambda Expression...

    public static void tumElemanlariTopla(List<Integer> list){
        System.out.println(list.stream().reduce((t, u) -> t + u).get());

        System.out.println(list.stream().reduce(Integer::sum).get());
   }


    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlariCarp(List<Integer> list){

        System.out.println(list.stream().filter(t -> t % 2 == 0).reduce(1, (t, u) -> t * u));

        Integer carpim =list.stream().filter(t->t%2==0).reduce(Math::multiplyExact).get();
        System.out.println(carpim);

        list.stream().filter(Methodlarim::ciftElemaniBul).reduce(Math::multiplyExact).get();

   }

    //TODO task tek sayilarin  karesini buyukten kucuge
     public static void teklerinKareBuyuktenKucuge(List<Integer> list) {

     list.stream().// liste akışa alındı
             filter(t->t%2==1). // tek olanlar filtrelendi
             map(t -> t * t). // her tek sayinin karesi alındı
             sorted(Comparator.reverseOrder()). //büyükten küçüğe sralandı
             forEach(Methodlarim::Yazdir); // method ile yazdırıldı.

     }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek){
        yemek.stream().
                sorted(Comparator.comparing(t->t.toString().
                        charAt(t.toString().length()-1)).reversed()).
                forEach(Methodlarim::Yazdir);
    }
    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek){

       boolean kontrol=yemek.stream().allMatch(t->t.length()<=7);
       if (kontrol) {
           System.out.println("tüm elemanlar 7 ve daha az karaktere sahip");
       } else System.out.println("bazı elemanlar 7'den buyuk");

       // modern çözüm
        System.out.println(yemek.stream().
                allMatch(t -> t.length() <= 7 ) ? "tüm elemanlar 7 ve daha az karaktere sahip" :
                "bazı elemanlar 7'den buyuk");

    }



}
