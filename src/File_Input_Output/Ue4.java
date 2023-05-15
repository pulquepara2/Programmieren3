package File_Input_Output;

import java.io.File;

public class Ue4 {
    public static void main(String[] args) {
        String dir = "C:\\";

        try {

            File file3 = new File(dir);

            //list all dirs an files

            System.out.println("Gibt es dieses file/ordner: " + file3.exists());
            System.out.println("Ist es eine directory: " + file3.isDirectory());
            File[] fileList = file3.listFiles();
            System.out.println("Files are: ");
            printFilesOfSpecificDirectory(fileList);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

    public static void printFilesOfSpecificDirectory(File[] inputarray) {
        int counter = 0;
        long totallength = 0;
        for (File currentfile : inputarray) {
            if (currentfile.isFile()) {
                System.out.println("Eintrag " + counter + " FILE: " + currentfile.getAbsolutePath());
                System.out.println("\t" + currentfile.length());
                System.out.println("\t" + currentfile.getName());
                totallength = totallength + currentfile.length();

            }
            counter++;

        }
        System.out.println("Gesamtlaenge aller Files: " + totallength);
    }
}

