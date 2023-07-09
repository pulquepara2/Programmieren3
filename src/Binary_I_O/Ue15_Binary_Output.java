package Binary_I_O;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ue15_Binary_Output {
    public static void main(String[] args) throws IOException {

        File f = new File("vonkonsole.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        char c;


        while ((c = (char) System.in.read()) != 'x') {
            ;
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Closed");
    }
}

