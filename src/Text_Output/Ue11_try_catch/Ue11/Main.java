package Text_Output.Ue11_try_catch.Ue11;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Ue11 starting up...");

        Product p1 = new Product("Besen", 12.9, "Haushaltswaren");
        Product p2 = new Product("Iphone 15", 1200, "Elektronik");
        Product p3 = new Product("Rucksack", 25.85, "Accessoires");

        ProductManager pm = new ProductManager();

        pm.add(p1);
        pm.add(p2);
        pm.add(p3);

        pm.saveToFile("C:\\Users\\s53033\\Products.txt");
        pm.readFromFile("C:\\Users\\s53033\\Products.txt");
    }

}
