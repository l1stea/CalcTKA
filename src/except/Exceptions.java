package except;

import convert.Converter;

public class Exceptions {
    public boolean check;
    public Exceptions(String[] words) throws Exception {
        Check(words);
    }
    public void Check(){}

    //Всё что ниже выглядит некрасиво и наверное делается по-другому, но мне лень делать лучше
    public boolean Check(String[] words) throws Exception {
        check = false;
        if (words.length != 3) {
            check = true;
            System.out.println("Формат строки: \"Число 1\" \"Пробел\" \"Арифметический знак\" \"Пробел\" \"Число 2\"!");
            return check;
        }

        try {
            Converter.Convert(words[0]);
        }
        catch (Exception e) {
            check = true;
            System.out.println("Первое число! Ошибка в типе данных!");
        }

        try {
            Converter.Convert(words[2]);
        }
        catch (Exception e){
            check = true;
            System.out.println("Второе число! Ошибка в типе данных!");
        }
        if (Math.abs(Converter.ConvertLong(words[0]) + Converter.ConvertLong(words[0])) > Integer.MAX_VALUE) {
            check = true;
            System.out.println("Число вышло за диапозон 2147483647 в результате вычислений! Невозможно посчитать!");
            return check;
        }
        if (Math.abs(Converter.ConvertLong(words[0]) - Converter.ConvertLong(words[0])) > Integer.MAX_VALUE) {
            check = true;
            System.out.println("Число вышло за диапозон 2147483647 в результате вычислений! Невозможно посчитать!");
            return check;
        }
        if (Math.abs(Converter.ConvertLong(words[0]) * Converter.ConvertLong(words[0])) > Integer.MAX_VALUE) {
            check = true;
            System.out.println("Число вышло за диапозон 2147483647 в результате вычислений! Невозможно посчитать!");
            return check;
        }
        if (Math.abs(Converter.ConvertLong(words[0]) / Converter.ConvertLong(words[0])) > Integer.MAX_VALUE) {
            check = true;
            System.out.println("Число вышло за диапозон 2147483647 в результате вычислений! Невозможно посчитать!");
            return check;
        }
        return  check;
    }
}
