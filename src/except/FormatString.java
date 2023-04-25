package except;

public class FormatString {
    String str = "Формат строки: \"Число 1\" \"Пробел\" \"Арифметический знак\" \"Пробел\" \"Число 2\"!";
    public boolean check;

    FormatString(String[] words) {
        if (words.length != 3) {
            System.out.println(this.str);
        }

        this.check = true;
    }
}