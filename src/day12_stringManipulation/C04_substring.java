package day12_stringManipulation;

public interface C04_substring {
    public static void main(String[] args) {

        String str="Ja2va can3ımı oku5du";

        System.out.println(str.substring(5,6));
        System.out.println(str.substring(5));
        System.out.println(str.substring(2,8));

        String str2=str.replace("Java", "Bu Ahmet varya");
        System.out.println(str2);

        String str3=str.replaceAll("\\s","xxx");
        System.out.println(str3);

        /* String str= "Java cok yasa";
        System.out.println(str.substring(3,4)); // a
        System.out.println(str.substring(5,7)); // co
        System.out.println(str.substring(6,6)); // ""
        System.out.println("====");
        // System.out.println(str.substring(6,2)); // exception*/

    }
}
