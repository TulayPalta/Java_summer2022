package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

     int sayi1=132;
     byte sayi2=(byte)sayi1;
     System.out.println(sayi2);

    /* Geniş data türündeki değeri dar data türündeki variable'a atamak isterseni
    java sizin geniş data türündeki değerin dar data türündeki değere uyup uymayacağını çalıştırana kadar bilemez ama java risk almaz
    Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi bekler.
    bunun için değerin önüne parantez içinde istediğiniz data türünü yazmanız yeterlidir.

    Bu riski üstlendiğimizde 3 durum oluşabilir.
    1- bizim değerlerimiz dar kalıp değerlerine uygunsa hiçbir kayıp olmadan cast olur
    2- double bir sayıyı int bir sayıya cast etmek gibi durumlarda data kaybı yaşayabilirsiniz.
    3- geniş kalıptan değeri dar kalıba koyduğunuzda sınırları aşan durumlarda veri başkalaşabilir.
     */

    }
}
