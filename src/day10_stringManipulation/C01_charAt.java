package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

     /*   String str= "Java Öğrenmek Ne Güzel";
        System.out.println(str.charAt(0)); // ilk harfi yazdırır
        System.out.println(str.toUpperCase().charAt(7));
        System.out.println(str.charAt(21));

      */

       // System.out.println(str.charAt(22));
        // Son harfi bulmak için str'in uzunluğunun 1 eksiğini index olarak gireriz.
        // eğer index uzunluğu veya daha bir sayıyı girersek Java exception verir.
        // charAt metodu kullandığımızda sonuç char olacağı için artık manipulation yapamayız.
        // String methotlarından kullanmamız gereken bir metod varsa charAt'ten önce kullanmalıyız.


        String str= "Java Öğrenmek Ne Güzel";
        System.out.println(str.charAt(str.length()-5));
        System.out.println(str.toUpperCase().charAt(5));






    }
}
