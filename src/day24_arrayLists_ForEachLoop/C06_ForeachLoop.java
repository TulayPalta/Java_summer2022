package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int[] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // arraydeki tüm elemanlari inceleyelim,
        // tek sayi olanları list'e atayalim

        for (int each : arr //gelecek datalarin türü, loop icinde ne isim verdiğim, nereden aldıgım
             ) {
            if(each%2==1){
                liste.add(each);
            }

        }
        System.out.println(liste);

    }
}
