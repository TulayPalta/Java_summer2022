package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime= "cok";

        // Verilen kelime için aşağıdaki şartlardan uygun olanı yazan bir program yazınız.
        // Verilen kelime cümlede kullanılmamış
        // Verilen kelime cümlede bir kere kullanılmış
        // Verilen kelime cümlede birden fazla kullanılmış

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex!=-1) {
            if(kelimeIlkIndex==kelimeSonIndex) {
                System.out.println("Verilen kelime cümlede bir kere kullanılmış");
            }else {
                System.out.println("Verilen kelime cümlede birden fazla kullanılmış");
            }
        } else {
            System.out.println("Verilen kelime cümlede birden fazla kullanılmamış");
        }


    }
}
