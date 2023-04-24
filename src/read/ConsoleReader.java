package read;

import iface.IConsoleReader;

import java.io.IOException;

public class ConsoleReader implements IConsoleReader {
    @Override
    public String Read() {
        int inChar;
        String string = "";
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                string += (char) inChar;
                inChar = System.in.read();
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения!");
        }
        return string;
    }
}
