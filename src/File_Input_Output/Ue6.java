package File_Input_Output;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Ue6 {
    public static void main(String[] args) {
        String dir = "C:\\Users\\s53033\\";
        File file = new File(dir);
        createFiles(file);
        renameFiles(file);
    }

    public static void createFiles(File file) {
        for (int i = 0; i < 10; i++) {
            String filename = ThreadLocalRandom.current().nextInt() + "mp3";
            File fileToCreate = new File(file.getAbsolutePath() + "\\t" + filename);
            //System.out.println("File" + i + fileToCreate.getAbsolutePath());
            try {
                fileToCreate.createNewFile();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (fileToCreate.exists())
                System.out.println("File " + fileToCreate.getAbsolutePath() + " CREATED");
            else {
                System.out.println("ERROR: File" + fileToCreate.getAbsolutePath() + " CANNOT BE CREATED");
            }
        }
    }

    public static void renameFiles(File file) {
        for (File currentfile : file.listFiles()) {
            if (currentfile.isFile()) {
                File renamed = new File(file.getAbsolutePath() + File.separator + "1_" + currentfile.getName());
                if (currentfile.renameTo(renamed)) {
                    System.out.println("Erfolg: File " + currentfile.getAbsolutePath() + " was renamend to " + renamed.getAbsolutePath());
                }
            }
        }


    }
    public static void deleteFile (File file){
        for(File currentfile : file.listFiles()) {
            if(currentfile.isFile()){
                if(currentfile.delete()){
                    System.out.println("Erfolg: File " + currentfile.getAbsolutePath()+ " was deleted");
                }
            }
        }
    }
}
