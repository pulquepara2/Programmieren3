package Text_Output;

import java.io.*;

public class Ue9 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s53033\\eingabetext.txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Das ist die erste Zeile");
        pw.println("Das ist die zweite Zeile!!");

        pw.close();
    }
}

