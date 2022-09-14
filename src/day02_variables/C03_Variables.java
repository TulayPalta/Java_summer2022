package day02_variables;

public class C03_Variables {

        public static void main(String[] args) {
            // Uygulama_1-Farkli 3 data turunde
            //variable olusturun ve bunlari yazdirin
            int sayi=500;
            double yenisayi=99;
            char newchar='9';
            System.out.println("int type sayi:"+sayi); // int type sayi:7000
            System.out.println("double type sayi:"+yenisayi); //double type sayi:9.87
            System.out.println("char değeri : " + newchar); //char değeri : 9
            // Uygulama_2- isim ve soyisim icin iki variable olusturun
            // ve bunlari isminiz : Mehmet soyisminiz : Bulutluoz
            //seklinde yazdirin
            String isim="Tulay";
            String soyIsim="Palta";
            System.out.println("İsminiz : " + isim);
            System.out.println("Soyisminiz : " + soyIsim);
            // Uygulama_3- Iki farkli tamsayi data turunde 2 variable
            // olusturun bunlarin toplamini yazdirin
            byte num1=6;
            int num2=94;
            System.out.println("İki Sayının Toplamı : " + (num1+num2));
            // Uygulama_4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
            double toplam;
            int sayi3=96;
            double sayi4=3.14;
            toplam=sayi3+sayi4;
            System.out.println("İki Sayının Toplamı : " + toplam);
            // Uygulama_5 - char data turunde bir variable olusturun ve yazdirin
            char harf0='A';
            System.out.println("Char'ın Yazdırılması : " + harf0);
            // Uygulama_6- Bir tamsayı, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
            int sayi5=17;
            char harf1= 'A';// A nın ASCII kod karakter karşılığı değeri 65
            System.out.println("Bir Tam Sayı ve Char Değişkeni'nin Toplam Sayısal Değeri : " + (sayi5+harf1));
        }
    }




