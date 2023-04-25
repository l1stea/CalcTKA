package convert;

public class Converter {
    public Converter() {
    }

    public static int ConvertInt(String str) {
        return Integer.parseInt(str);
    }

    public static long ConvertLong(String str) {
        return Long.parseLong(str);
    }

    public static int ConvertRomanToArabic(String str) {
        return ConverterRomanNum.romanToArabic(str);
    }

    public static String ConvertArabicToRoman(int num) {
        return ConverterRomanNum.arabicToRoman(num);
    }
}