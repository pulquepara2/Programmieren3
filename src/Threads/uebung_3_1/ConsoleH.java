package Threads.uebung_3_1;

import java.util.Scanner;

public class ConsoleH {
    public static String readLine() {
        // InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
