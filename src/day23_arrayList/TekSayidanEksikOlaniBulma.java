package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekSayidanEksikOlaniBulma {
    public static void main(String[] args) {

        Integer[] arr= {1,3,5,7,9,13,15,17};
        List<Integer> TekSayiList= Arrays.asList(arr);
        for (int i=0;i<9; i++){
            int sayi=2*i+1;
            if(!TekSayiList.contains(sayi)){
                System.out.println(sayi);
            }
        }
    }
}
