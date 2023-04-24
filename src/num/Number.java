package num;

import convert.Converter;
import iface.INumber;

public class Number implements INumber {
    public int Num = 0;

    public Number(){
        Num = 1;
    }

    public Number(String word){
        Num = Converter.Convert(word);
    }

    @Override
    public void InNum() {
        Num = 0;
    }
}
