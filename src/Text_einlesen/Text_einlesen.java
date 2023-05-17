package Text_einlesen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Text_einlesen {
    public static void main(String args[]) throws Exception {
        InputStream ins = new FileInputStream("C:\\Users\\s53033\\einlesetext.txt");
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine())
            System.out.println(obj.nextLine());

    }
}