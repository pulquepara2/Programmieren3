package Text_einlesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text_einlesen_Ue7 {
    //im Unterricht gemacht
    public static void main(String[] args) throws IOException {
        //Pfad von Datei ausgeben
//        File f = new File("einlesetext.txt");
//        System.out.println("Absoluter Pfad zu Datei: " + f.getAbsolutePath());
        FileReader fr= new FileReader("C:\\Users\\s53033\\einlesetext.txt");
        BufferedReader br =new BufferedReader(fr);

        String zeile = br.readLine();
        //readline kann eine Exception verursachen, daher brauchen wir throws
        while (zeile != null){
            System.out.println(zeile);
            zeile = br.readLine();
        }
        br.close();
        // Close, damit andere Programme wieder darauf zugreifen können
        //Filereader muss nicht geschlossen werden, nur Br, der gibt die Info dann weiter
    }
}
