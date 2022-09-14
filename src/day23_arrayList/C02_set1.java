package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set1 {
    public static void main(String[] args) {
        /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        List<String> eskiUrunler= new ArrayList<>();
        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim
        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        listeGuncelle(yeniUrun, silinecekUrun, urunler, eskiUrunler);

    }

    public static void listeGuncelle(String yeniUrun, String silinecekUrun, List<String> urunler, List<String> eskiUrunler) {
        int temp=urunler.indexOf(silinecekUrun);

    }
}