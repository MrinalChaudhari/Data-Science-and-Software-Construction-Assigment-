package Session11;

import java.io.File;
import java.io.IOException;

public class Files {

    public static void file() throws IOException {

        File newfile=new File("C:\\Users\\Mrinal\\SWEN-601-03\\homework11-MrinalChaudhari\\src\\Session11\\filename.txt");
        newfile.createNewFile();

        System.out.println(newfile.getAbsolutePath());
        boolean b=newfile.exists();
        System.out.println(newfile.exists());
        if(newfile.exists()) {
            System.out.println(newfile.length());

        }
    }

    public static void main(String[] args) throws IOException {
        file();
    }
}
