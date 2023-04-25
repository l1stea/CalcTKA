package calc;

public class CalcArabic {
    public CalcArabic(String[] words) throws Exception {
        Calculator calc = new Calculator(words);
        System.out.println(calc.Run());
    }
}