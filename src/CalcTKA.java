import calc.Calculator;
import convert.Converter;
import read.ConsoleReader;
import except.Exceptions;

public class CalcTKA {
    public static void Calculate() {
        try {
            ConsoleReader CR = new ConsoleReader();
            String[] words = CR.Read().split("\\s");
            Exceptions exc = new Exceptions(words);
            Converter.ConverterRomanNum(words[0]);
            Converter.ConverterRomanNum(words[2]);
            if (!exc.check) {
                Calculator calc = new Calculator(words);
                calc.Run();
            }
        }
        catch (Exception e) {
            System.out.println(e);
            var check = e;
        }
    }
}
