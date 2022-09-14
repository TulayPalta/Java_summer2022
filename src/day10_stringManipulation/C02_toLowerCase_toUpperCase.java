package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopota bağlamayın";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        String str2="askım sen ne güzel bir seysin";
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));
        System.out.println(str2.toUpperCase().charAt(7));

    }

}
