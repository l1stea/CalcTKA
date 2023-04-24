package convert;
import static convert.ConverterRomanNum.romanToArabic;

public class Converter {
    public static int Convert(String str) {
        return Integer.parseInt(str);
    }
    public static long ConvertLong(String str) {
        return Long.parseLong(str);
    }
    public static int ConverterRomanNum(String str) {
        return romanToArabic(str);
    }
}
