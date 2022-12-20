package day17_nestedForLoop;

public class deneme {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input = " ta ka  tu ka ";
        input=input.replaceAll("\\s","");
        String tekrarsiz=input.substring(0,1);

        for (int i=1; i<input.length(); i++){
            if (!tekrarsiz.contains(input.substring(i,i+1))){
                tekrarsiz+=input.substring(i,i+1);
            }
        }
        System.out.println(tekrarsiz);

    }
}













