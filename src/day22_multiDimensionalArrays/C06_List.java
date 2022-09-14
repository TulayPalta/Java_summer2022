package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C06_List {
    public static void main(String[] args) {
        /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler= new ArrayList<>();
        System.out.println(isimler); // []
        // bir list'e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse")); // true doner
        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman
         */
        System.out.println(isimler); // [Basak, Ayse]
        /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */
    }

    public static class C03_ListSil {

        public static void main(String[] args) {
            // Verilen bir array'den istenen degere sahip elementleri silip
            // kalani yeni bir array olarak kaydedin
            // ve sonra yeni array'i yazdirin

            int arr[]= {3,4,5,6,3,5,5,5,5,5,5};
            int silinecekEleman=5;

            List<Integer> gecici= new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] != silinecekEleman) {
                    gecici.add(arr[i]);
                }

            }

            System.out.println("list olarak : " + gecici); // list olarak istenmeyen eleman haric tum elemanlari goruruz

            // sonucu array olarak istiyorsak
            // listedekileri yeni array'e ekleyebiliriz

            int yeniArray[]= new int[gecici.size()];

            for (int i = 0; i < yeniArray.length; i++) {

                yeniArray[i]= gecici.get(i);

            }

            // yeni array'imizi yazdiralim
            System.out.println("Array olarak : "+ Arrays.toString(yeniArray));


        }

    }
}