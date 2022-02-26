package Homework19;

import java.io.File;
import java.io.IOException;

import static Homework19.FileUtils.*;
public class CopierThread extends Thread {

    String source;
    String destination;
    public int getSize() {
        return size;
    }
    Exception exception;
    int size;

    public Exception getExp() {
        return exception;
    }

    //Thread to copy one file at a time from source directory to destination directory
    public CopierThread(String source, String destination) {
        this.source=source;
        this.destination=destination;
    }

    @Override
    public void run() {
        try {
            copyFile(source,destination);
        } catch (IOException e) {
            exception=e;
        }
    }
    public static void main(String[] args) {

        System.out.println("Clearing directory 'output'.");
        clearDirectory(args[0]);

        File[] files=new File("C:\\Users\\Mrinal\\SWEN-601-03\\homework19-MrinalChaudhari\\input1\\").listFiles();
        int count=0;
        long size=0;
        long time1=System.currentTimeMillis();

        for(File file: files) {
            if(file.isFile()) {
                count++;
                System.out.println("Copying file "+file.getName());
                Thread thread=new CopierThread(file.getName(),file.getName());
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                size=size+file.length();
            }
        }
        long time2=System.currentTimeMillis();
        System.out.println("Copied "+count+" files("+size+ " bytes) in "+(time2-time1)+" milliseconds");
    }
}
