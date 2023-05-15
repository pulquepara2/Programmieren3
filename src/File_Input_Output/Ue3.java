package File_Input_Output;

import java.io.File;

public class Ue3 {
    public static void main(String[] args) {
        String dir = "C:\\Users\\s53033\\";

        try {

            File file3 = new File(dir);

            //list all dirs an files

            System.out.println("Gibt es dieses file/ordner: " + file3.exists());
            System.out.println("Ist es eine directory: " + file3.isDirectory());
            File[] fileList = file3.listFiles();
            System.out.println("Files are: ");
//            for (int i = 0; i < fileList.length; i++) {
//                System.out.println(fileList[i].getName());
//                if (fileList[i].isDirectory()) {
//                    System.out.println("Eintrag " + i + "DIR: " + fileList[i].getAbsolutePath());
//                } else {
//                    System.out.println("Eintrag " + i + "FILE: " + fileList[i].getAbsolutePath());
//                }
//            }
            printFilesOfSpecificDirectory(fileList);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

    public static void printFilesOfSpecificDirectory(File[] inputarray) {
        for (int i = 0; i < inputarray.length; i++) {
            if (inputarray[i].isDirectory()){
                System.out.println("Eintrag " + i + " DIR: " + inputarray[i].getAbsolutePath());
                System.out.println("Weil das ein DIR ist, hier der Inhalt: ");
                File[] subdirectory = inputarray[i].listFiles();
                printFilesOfSpecificDirectory(subdirectory);
            }
            else{
                System.out.println("Eintrag " + i + " FILE: " + inputarray[i].getAbsolutePath());
            }
        }
    }
}

//    public static void main(String[] args) {
//        String dir = "C:\\";
//        File f = new File(dir);
//        showFiles(f.listFiles());
//    }
//
//    public static void showFiles(File[] files) {
//        for (File file : files) {
//            if (file.isDirectory()) {
//                System.out.println("Directory: " + file.getAbsolutePath());
//                showFiles(file.listFiles()); // Calls same method again.
//            } else {
//                System.out.println("File: " + file.getAbsolutePath());
//            }
//        }
//    }
//}
