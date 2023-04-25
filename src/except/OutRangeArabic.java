package except;

import convert.Converter;

public class OutRangeArabic {
    String str = "Число вышло за диапозон 2147483647 в результате вычислений!";
    public boolean check;

    OutRangeArabic(String[] words) {
        switch (words[1]) {
            case "+":
                if (Math.abs(Converter.ConvertLong(words[0]) + Converter.ConvertLong(words[2])) > 2147483647L) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            case "-":
                if (Math.abs(Converter.ConvertLong(words[0]) - Converter.ConvertLong(words[2])) > 2147483647L) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            case "*":
                if (Math.abs(Converter.ConvertLong(words[0]) * Converter.ConvertLong(words[2])) > 2147483647L) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            case "/":
                if (Math.abs(Converter.ConvertLong(words[0]) / Converter.ConvertLong(words[2])) > 2147483647L) {
                    this.check = true;
                    System.out.println(this.str);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + words[1]);
        }

    }
}