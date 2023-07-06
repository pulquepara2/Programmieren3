package Text_einlesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Zeilenweise_Tastatureingaben_Ue8 {
    public static void main(String[] args) throws IOException {
        InputStreamReader fr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(fr);
        String zeile = br.readLine();
        while (zeile != null) {
            if (zeile.toLowerCase().equals("stop")) {
                break;
            }
            System.out.println(zeile);
            zeile = br.readLine();
        }
        br.close();

    }
    //       Fuchs Lösung:
    //        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    //        String line;
    //        BufferedReader br = new BufferedReader(inputStreamReader);
    //        while (!(line = br.readLine()).equals("STOP")){
    //            System.out.println(line);
    //        }
    //        br.close();
}
