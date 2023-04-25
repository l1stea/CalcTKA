import calc.CalcArabic;
import calc.CalcRoman;
import except.Exceptions;
import read.ConsoleReader;

public class CalcTKA {
    public CalcTKA() {
    }

    public static void Calculate() {
        try {
            ConsoleReader CR = new ConsoleReader();
            String[] words = CR.Read().split("\\s");
            Exceptions exc = new Exceptions(words);
            if (exc.checkArabic) {
                new CalcArabic(words);
            }

            if (exc.checkRoman) {
                new CalcRoman(words);
            }
        } catch (NumberFormatException ex) {
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
