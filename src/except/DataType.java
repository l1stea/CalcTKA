package except;

import convert.Converter;

public class DataType {
    String str = "Ошибка в типе данных: ";
    public boolean checkArabic;
    public boolean checkRoman;

    DataType(String word) {
        this.DataTypeRoman(word);
        if (!this.checkRoman) {
            this.DataTypeArabic(word);
        }
    }

    private void DataTypeArabic(String word) {
        try {
            Converter.ConvertInt(word);
            this.checkArabic = true;
        } catch (Exception var3) {
            System.out.println(this.str + word);
        }

    }

    private void DataTypeRoman(String word) {
        try {
            Converter.ConvertRomanToArabic(word);
            this.checkRoman = true;
        } catch (Exception var3) {
        }

    }
}