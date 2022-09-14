package day19_scope;

public class Karma {
    static String okulAdi="Yıldız Koleji";
    int maas=10000;

    public static void main(String[] args) {

        System.out.println(okulAdi);

        Karma Bunyamin=new Karma();
        Bunyamin.maas=15000;
        System.out.println(Bunyamin.maas);

        Karma Tulay=new Karma();
        Tulay.maas=20000;
        System.out.println(Tulay.maas);


    }




}
