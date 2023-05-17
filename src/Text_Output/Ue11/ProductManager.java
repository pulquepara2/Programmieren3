package Text_Output.Ue11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    public void saveToFile(String path) throws IOException {
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Product p: products) {
            bw.write(p.toString());
            bw.newLine();
            //wenn man printwriter verwendet, kann man println machen und hat die Produkte untereinander
        }

        bw.flush();
        bw.close();

    }

    public void readFromFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br =new BufferedReader(fr);
        String zeile = br.readLine();
        while (zeile != null){
            System.out.println(zeile);
            zeile = br.readLine();
        }
        br.close();

    }


}
