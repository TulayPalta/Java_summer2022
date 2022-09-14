package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        byte num1 =12;
        short num2= num1;
        int num3= num2;
        float num4= num3;
        double num5= num4;

        System.out.println(num5);

        byte sayi1=23;
        short sayi2 = 55;

        int sayi3= sayi1+sayi2;
        double sayi4= sayi2*sayi1;
        sayi4= (double)sayi2/sayi1; //dar veri türündeki bir değeri, geniş veri türündeki variable çevirir


        int sayi5=10;
        System.out.println(sayi5+3);


    }
}
