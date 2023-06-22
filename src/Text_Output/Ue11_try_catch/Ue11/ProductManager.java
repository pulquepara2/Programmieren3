package Text_Output.Ue11_try_catch.Ue11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    public void saveToFile(String path) {
        File f = new File(path);
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product p : products) {

                bw.write(p.toString());
            }
            bw.newLine();
            //wenn man printwriter verwendet, kann man println machen und hat die Produkte untereinander
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFromFile(String path) {
        FileReader fr = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);
        String zeile = null;
        try {
            zeile = br.readLine();

            while (zeile != null) {
                System.out.println(zeile);
                zeile = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}