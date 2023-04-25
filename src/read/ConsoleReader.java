package read;

import iface.IConsoleReader;
import java.io.IOException;

public class ConsoleReader implements IConsoleReader {
    public ConsoleReader() {
    }

    public String Read() {
        int inChar;
        String str = "";
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                str += (char) inChar;
                inChar = System.in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения!");
        }
        return str;
    }
}
