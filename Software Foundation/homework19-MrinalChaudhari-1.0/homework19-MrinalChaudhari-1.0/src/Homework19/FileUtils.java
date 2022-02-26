package Homework19;

import java.io.*;

public class FileUtils { //class starts

    static void copyFile(String source, String destination) throws IOException {
        String inputPath="C:\\Users\\Mrinal\\SWEN-601-03\\homework19-MrinalChaudhari\\input1\\";
        String outputPath="C:\\Users\\Mrinal\\SWEN-601-03\\homework19-MrinalChaudhari\\output\\";
        source=inputPath+source;
        destination=outputPath+destination;
        File newfile =new File(source);
        FileInputStream fileInput=new FileInputStream(newfile);
        byte[] buffer=new byte[1024];

        fileInput.read(buffer);

        File newfile1=new File(destination);
        FileOutputStream fileOutput=new FileOutputStream(newfile1);

        fileOutput.write(buffer);
    }
    public static void clearDirectory(String name) {

        File file=new File(name);
        if(file.isDirectory()) {
            for(File files: file.listFiles()) {
                files.delete();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            copyFile("input2.txt", "output2.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
        clearDirectory("C:\\Users\\Mrinal\\SWEN-601-03\\homework19-MrinalChaudhari\\output\\");
    }

}//end of class
