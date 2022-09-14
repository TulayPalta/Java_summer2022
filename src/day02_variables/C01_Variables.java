package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {

             int            not1               =                 60                       ;
        // data turu    variable ismi   assignment sign      variable değeri      işlem bitti işareti

          int not2   =    70;
        // variable      değer//
        // java önce değeri hesaplar sonra assign işlemini yapar
        // not2'yi 80 yapalım

        not1=100;

        not2=80;

        // yeni bir int variable olusturalım değeri ilk iki variable'nin ortalaması olsun

        int ort = (not1 + not2)/2 ;

        System.out.println(ort);

        System.out.println("Tebrikler");

    }
}
