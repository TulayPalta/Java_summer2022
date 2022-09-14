package day15_overloading_forloop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        // Java'da ayni isimde birden fazla method olur mu ?
		// cevap : EVET
        Java'da oluşturduğumuz method'ların isminin yaptığı işlev ile
        uyumlu olmasını isteriz. Mesela bir String'in bir bölümünü almak
        için Java 2 adet substring() method'u veya
        Verilen String'deki bazı parçaları yenileri ile değiştirmek icin
        2 adet replace()

        Java ayni isimde birden fazla method varsa hangisinin kullanılacağına
        parametre sayısı ve parametrelerin data türüne göre karar verir.
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,5);
        str.replace('c','v');
        str.replace("J","H");

/*
        Ayni isimde ama farkli method'lari olusturmak icin
           degistirebilecegimiz seyler
           1- parametre sayisi
           2- ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
           3- ayni sayida ve ayni data turunde parametreleri olan methodlarda
              parametrelerin siralanisi
         */

    }

}
