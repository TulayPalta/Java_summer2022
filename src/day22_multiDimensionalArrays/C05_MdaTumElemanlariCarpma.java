package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C05_MdaTumElemanlariCarpma {
    public static void main(String[] args) {
        /*
        Soru 2) Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */
        int[][] arr={ {1,2,3}, {4,5,2}, {6,3} };
        int[] carpimArr=new int[arr.length];
        int carpim=1;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                    carpim*=arr[i][j];
            }
            carpimArr[i]=carpim;
            carpim=1;
            }

        System.out.println(Arrays.toString(carpimArr));

    }
}