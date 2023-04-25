package calc;

import convert.Converter;

public class CalcRoman {
    public CalcRoman(String[] words) throws Exception {
        words[0] = String.valueOf(Converter.ConvertRomanToArabic(words[0]));
        words[2] = String.valueOf(Converter.ConvertRomanToArabic(words[2]));
        Calculator calc = new Calculator(words);
        System.out.println(Converter.ConvertArabicToRoman(calc.Run()));
    }
}