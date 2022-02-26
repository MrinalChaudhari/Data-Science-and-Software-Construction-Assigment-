package Homework19;

import java.io.File;
import java.io.IOException;


public class FileCopier extends  FileUtils {
    public static void main(String[] args) throws IOException {
        if(args.length<2) {
            System.out.println("Usage: java homework.FileCopier <input dir> <output dir>");
            System.exit(1);
        }
        System.out.println("Clearing directory 'output'");

        clearDirectory(args[0]);

        File[] files=new File("C:\\Users\\Mrinal\\SWEN-601-03\\homework19-MrinalChaudhari\\input1\\").listFiles();
        int count=0;
        long size=0;
        long time1=System.currentTimeMillis();

        for(File file: files) {
            if(file.isFile()) {
                System.out.println("Copying file "+file.getName());
                copyFile(file.getName(),file.getName());
                count++;
                size=size+file.length();
            }
        }
        long time2=System.currentTimeMillis();
        System.out.println("Copied "+count+" files("+size+ " bytes) in "+(time2-time1)+" milliseconds");
    }
}
