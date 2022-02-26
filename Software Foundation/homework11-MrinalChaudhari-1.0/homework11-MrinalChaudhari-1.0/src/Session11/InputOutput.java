package Session11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutput {
    public static void  writeString(List<Array> list, File filename) {

        try{
            FileWriter fw=new FileWriter(filename);
            int i=0;
            while(i<list.size()) {
                fw.write(String.valueOf(list.get(i)));
                fw.write("\n");
                i++;
            }
            fw.close();

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }

    public static List<Array> readString(File file) {
        List<Array> list=new ArrayList<>();
        try {
            FileReader fr=new FileReader(file);

            int n=0;

            while(true) {
                n=fr.read();
                if(n=='B'){
                    Array s=new Array(Piece.BLACK);
                    list.add(s);
                }
                else if(n=='W') {
                    Array s=new Array(Piece.WHITE);
                    list.add(s);
                }
                else if(n==' ') {
                    Array s=new Array();
                    list.add(s);
                }

                else if(n<=0) {
                    break;
                }
            }

            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static void main(String[] args) {

        File file=new File("C:\\Users\\Mrinal\\SWEN-601-03\\homework11-MrinalChaudhari\\src\\Session11\\out.txt");
        List<Array> list=new ArrayList<>();

        list.add(new Array(Piece.WHITE));
        list.add(new Array());
        list.add(new Array(Piece.BLACK));
        writeString(list,file);

        File file1=new File("C:\\Users\\Mrinal\\SWEN-601-03\\homework11-MrinalChaudhari\\src\\Session11\\in.txt");

        List<Array> list1=readString(file1);
        int i=0;
        while(i<list1.size()) {
            System.out.println(list1.get(i));
            i++;
        }



    }
}
