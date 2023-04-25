package except;

import convert.Converter;

public class OutRangeRoman {
    String str = "Вычисления вышли за диапозон 1 - 3999 в результате вычислений!";
    public boolean check;

    OutRangeRoman(String[] words) {
        switch (words[1]) {
            case "+":
                if (Converter.ConvertRomanToArabic(words[0]) + Converter.ConvertRomanToArabic(words[2]) > 3999) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            case "-":
                if (Converter.ConvertRomanToArabic(words[0]) - Converter.ConvertRomanToArabic(words[2]) < 1) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            case "*":
                if (Converter.ConvertRomanToArabic(words[0]) * Converter.ConvertRomanToArabic(words[2]) > 3999) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            case "/":
                if (Converter.ConvertRomanToArabic(words[0]) / Converter.ConvertRomanToArabic(words[2]) < 1) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + words[1]);
        }

    }
}
