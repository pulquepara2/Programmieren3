package Binary_I_O;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ue14_Binary_Output {
    public static void main(String[] args) throws IOException {
        File f = new File("binaererOutput.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(f);

        String outputtext = "Hallo, ich muss hier noch einiges lernen.";
        for(char c : outputtext.toCharArray()){
            fileOutputStream.write(c);
        }
        fileOutputStream.flush(); //nicht vergessen!
        fileOutputStream.close();
    }
}
