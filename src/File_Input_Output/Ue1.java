package File_Input_Output;

import java.io.File;

public class Ue1 {
    public static void main(String[] args) {
        File firstfile = new File("test.txt");

        System.out.println("Datei existiert: " +firstfile.exists());
        System.out.println("Full filepath " +firstfile.getAbsolutePath());
        System.out.println("Name: " + firstfile.getName());
        System.out.println("Parent: " + firstfile.getParent());
        System.out.println("Path: " + firstfile.getPath());
        System.out.println("Directory: " + firstfile.isDirectory());
        System.out.println("File: " + firstfile.isFile());
        System.out.println("Readable: " + firstfile.canRead());
        System.out.println("Writeable " + firstfile.canWrite());
        System.out.println("Hidden? " + firstfile.isHidden());
        System.out.println("Length: " + firstfile.length());
        System.out.println("Length (Kilo Bytes): " + firstfile.length()/1024.0);

        // create new file

        File file2 = new File("k.txt");
        try {
            file2.createNewFile();
        }
        catch (Exception e){}
    }
}