package Threads.uebung2;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable{
    private String path;
    public ArrayList<String> lines;

    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
        lines = new ArrayList<>();
    }

    @Override
    protected void work() {
        File f = new File(path);
        System.out.println("Absoluter Pfad: " +f.getAbsolutePath());
        FileReader fr;
        BufferedReader br;
        String oneline;
        try {
             fr = new FileReader(f);
             br = new BufferedReader(fr);
             while ((oneline = br.readLine())!=null){
                 if(shouldRun == false){ // um höflich zu stoppen
                     break;
                 }
                 System.out.println("read line: " + oneline);
                 lines.add(oneline);
                 Thread.sleep(1000);
             }
             br.close();
        } catch (IOException  | InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        work();
    }
}
