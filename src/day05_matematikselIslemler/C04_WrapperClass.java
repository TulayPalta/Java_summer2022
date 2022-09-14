package day05_matematikselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str = "Java cok guzel";
        str.toUpperCase();

        int sayi= 10;
        // primitive data türlerinin yanında method'lar olmaz.
        // Java bazı method'ları kullanambilmemiz icin
        // hher bir primitive data türü için bir wrapper class oluşturmuştur.

        Integer sayi2= 10;
        sayi2.byteValue();

    }

}
