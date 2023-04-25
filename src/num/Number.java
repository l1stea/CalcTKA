package num;

import convert.Converter;
import iface.INumber;

public class Number implements INumber {
    public int Num = 0;

    public Number() {
        this.Num = 1;
    }

    public Number(String word) {
        this.Num = Converter.ConvertInt(word);
    }

    public void InNum() {
        this.Num = 0;
    }
}
