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
    // Methods of BufferedWriter
    //        The BufferedWriter class provides implementations for different methods present in Writer.
    //    write() Method
    //    write() - writes a single character to the internal buffer of the writer
    //    write(char[] array) - writes the characters from the specified array to the writer
    //    write(String data) - writes the specified string to the writer

    // FileWriter fileWriter = new FileWriter("neue_datei_18mai.txt");
    //        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    //        // BufferedWriter bufferedReader = new BufferedWriter(new FileWriter("neue_datei_18mai.txt"));
    //
    //        String data = "Das ist ein test";
    //        bufferedWriter.write(data);
    //        bufferedWriter.write(data);
    //        bufferedWriter.newLine();
    //        bufferedWriter.write(data);
    //        bufferedWriter.flush();
    //        bufferedWriter.close();
    //        System.out.println("Fertig");
}

