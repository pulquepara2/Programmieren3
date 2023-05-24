package Text_einlesen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Uebung8_mit_Exception {
    //Unterschied: try catch- ich kann Fehlermeldung behandeln
    // bei throw: Programm stirbt einfach
        public static void main(String[] args)  {
            InputStreamReader fr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(fr);
            String zeile = null;
            try {
                zeile = br.readLine();
                while (zeile != null) {
                    if (zeile.toLowerCase().equals("stop")) {
                        break;
                    }
                    System.out.println(zeile);
                    zeile = br.readLine();
                }
                br.close();
                throw new IOException("Fehler: Das ist eine Testexception");
                //wir brauchen throws nicht mehr, weil wir mit try/catch es fangen
            }
            catch (IOException meineException){
                System.out.println("Fehler: IO Exception, etwas ist schiefgelaufen. Nachricht: "
                        + meineException.getMessage());
            }
            //um Dateien zu schließen, aufzuräumen, wird immer ausgeführt
            finally {

            }
        }
    }

