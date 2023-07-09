package Binary_I_O;

import java.io.*;

public class Ue16_Obj {
    public static void main(String[] args) {
        String s = "Hallo Welt!";
        byte[] b = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};

        File f = new File("object.dat");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //ins file schreiben
            objectOutputStream.writeObject(s);
            objectOutputStream.writeObject(b);

            objectOutputStream.flush();
            objectOutputStream.close();

            //auslesen
            FileInputStream fileInputStream = new FileInputStream(f);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //casten nicht vergessen!!
            System.out.println((String) objectInputStream.readObject());


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
