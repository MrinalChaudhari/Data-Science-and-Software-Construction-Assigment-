package session13;

import java.io.DataOutput;

public class Generic {
    
    public static  void printarray(Integer [] array){
        StringBuilder arrayPrintString = new StringBuilder("Array ");
        if (array!=null && array.length!=0){
            for (Integer printobject : array){
                arrayPrintString.append(printobject).append("||");
            }
        }else {
            arrayPrintString.append("Empty array");
        }
        System.out.println(arrayPrintString);
    }

    public static <ArrayType> void printAnyArray(ArrayType [] array){
        StringBuilder arrayPrintString = new StringBuilder("Array ");
        if (array!=null && array.length!=0){
            for (ArrayType printobject : array){
                arrayPrintString.append(printobject).append("||");
            }
        }else {
            arrayPrintString.append("Empty array");
        }
        System.out.println(arrayPrintString);
    } 
    public static void main(String [] args){
        Integer [] integerarray=new Integer[]{ 32,56,56,32};
        Double [] doublearray=new Double[]{65.2,23.36,56.2};
        String [] stringarray=new String[]{"Mrinal","Satish","Chaudhari"};

        printAnyArray(integerarray);
        printarray(integerarray);
        printAnyArray(doublearray);
        printAnyArray(stringarray);

    }

    
}
   
