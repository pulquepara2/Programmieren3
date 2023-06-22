package Network.Network_1_A;

import javax.imageio.IIOException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromURL {
    public static void main(String[] args) {
        try {
            System.out.println("Main starting up...");
            System.out.println("Bitte die gewünschte URL eingeben: ");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String user_url = userInput.readLine();
            System.out.println("Habe folgende URL bekommen: " + user_url);
            //URL auslesen
            URL myURL = new URL(user_url);
            InputStreamReader isr = new InputStreamReader(myURL.openStream());
            BufferedReader br = new BufferedReader(isr);
            String one_line;
            File f = new File("content.html");
            System.out.println("Datei ist hier: " + f.getAbsolutePath());
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            while ((one_line = br.readLine()) != null) {
                System.out.println(one_line);

                bw.write(one_line);
                bw.newLine();
              //  saveToFile("C:\\Users\\s53033\\IdeaProjects\\Programmieren3\\content.html", one_line);
            }
            bw.flush();
            bw.close();


        } catch (IOException e) {

            throw new RuntimeException(e);

        }



    }


    public static void saveToFile (String path, String text) throws IOException {
        File f = new File(path);
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}