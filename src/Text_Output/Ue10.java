package Text_Output;

import java.io.*;

public class Ue10 {
    public static void main(String[] args) throws IOException {

        //einlesen
        InputStreamReader fr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(fr);
        //Schreiben auf file
        File f = new File("C:\\Users\\s53033\\meineNoten.txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        String zeile = br.readLine();
        while (zeile != null) {
            if (zeile.equals("stop")) {
                break;
            }
            System.out.println(zeile);
            pw.println(zeile);
            pw.flush();
            zeile = br.readLine();


        }
        pw.flush();
        br.close();

    }
    //File f = new File("meineNoten.txt");
    //        FileWriter fileWriter = new FileWriter(f);
    //        PrintWriter printWriter = new PrintWriter(fileWriter);
    //        InputStreamReader streamy = new InputStreamReader(System.in);
    //        BufferedReader br = new BufferedReader(streamy);
    //
    //        String line;
    //        System.out.println("Text eingeben: ");
    //
    //        while (!(line= br.readLine()).equals("STOP")){
    //            printWriter.println(line);
    //            System.out.println(line);
    //
    //            }
    //            br.close();
    //            printWriter.flush();
    //            printWriter.close();
    //
    //        }
}
