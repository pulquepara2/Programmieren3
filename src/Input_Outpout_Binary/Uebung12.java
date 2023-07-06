package Input_Outpout_Binary;

import java.io.*;

public class Uebung12 {
    public static void main(String[] args) throws IOException {
        File file = new File("test-output.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int byteread;
        while ((byteread = bufferedInputStream.read())!=-1){
            char[] ch = Character.toChars(byteread);
            System.out.println(ch);
            System.out.println((char) byteread);

        }
        bufferedInputStream.close();
    }
}
