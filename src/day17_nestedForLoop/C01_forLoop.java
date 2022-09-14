package day17_nestedForLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input = "taka tuka";
        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {
        String tekrarsiz="";
        String bosluksuz=input.replaceAll("\\W",""); // EmsalEfe
        System.out.print(bosluksuz.substring(0,1)); // E
        tekrarsiz+=bosluksuz.substring(0,1);  // E

        for (int i = 1; i <bosluksuz.length() ; i++) {
            if (!tekrarsiz.contains(bosluksuz.substring(i,i+1))){
                System.out.print(", "+ bosluksuz.substring(i,i+1));
                tekrarsiz+=bosluksuz.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + tekrarsiz);
    }
}













