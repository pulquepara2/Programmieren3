package Text_Output;

import java.io.*;

public class Ue9 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s53033\\eingabetext.txt");
        FileWriter fw = new FileWriter(f, true);
        //erst jetzt exisitert das file, aber es ist noch leer
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Das ist die dritte Zeile");
        pw.println("Das ist die vierte Zeile mit append:true angefügt!!");
        pw.flush();
        pw.close();
        //wenn ich close, wird automatisch geflusht, aber wir schreiben schön und deswegen auch flush
    }
}

