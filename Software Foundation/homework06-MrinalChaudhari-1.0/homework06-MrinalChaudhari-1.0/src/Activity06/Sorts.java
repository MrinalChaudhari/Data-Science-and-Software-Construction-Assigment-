package Activity06;

public class Sorts {
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String args[]){
        int[] arr1 = {10,23,2,1,6,4,3,89,56};
        System.out.println("Before Selection Sort,");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
