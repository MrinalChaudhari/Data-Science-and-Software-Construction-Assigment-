package Homework16;

import java.util.Arrays;
import java.util.*;

//This class implements Heap interface to develop methods
public class ArrayHeap implements Heap {

    private int[] array;
    private int size;

    public ArrayHeap(int sequence){
        array=new int[sequence];
        size=0;
    }

    public ArrayHeap(int[] arr) {
    }

    /*
    * Sifts a value up from the specified index in a heap.*/
    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }
    //Swaps the values at the specified indexes.
    static void swap(int[] array, int from, int to) {
        if(from != to) {
            int tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }

    @Override
    public void add(int value) {
        if(array.length==size){
            array= Arrays.copyOf(array,size*2);
        }
        array[size]=value;
        size++;
        siftUp(array,size-1);
    }

    //Sifts a value down from the root in a heap.
    static void siftDown(int[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && array[left] < array[to]) {
                to = left;
            }

            if(right < size && array[right] < array[to]) {
                to = right;
            }

            swap(array, from, to);

        } while(from != to);
    }

    //(minheap)returns the element at the root
    public int getMinimum() {

        if (isEmpty()) {
            System.out.println("Heap is empty");
        } else
            return array[0];
        return 0;
    }

    //This method is use to check whether heap is empty or not
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void remove() {
        if(isEmpty()){
            System.out.println("Heap is empty");
        }
        array[0]=array[size-1];
        size--;
        if (size>0){
            siftDown(array,size);
        }
    }

    //all element are inserting into the heap and printing sorted element
    private void HeapSort(ArrayHeap heap) {
        for (int val : array) {
            add(val);
        }

        while (!isEmpty()) {
            System.out.println(getMinimum());
            remove();
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayHeap{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    /***
     * Hashset is used to delete duplicate entry from data
     * Random is used to create 50 random numbers from 0 to 100
     */


    public static void main(String[] args) {

        int N = 50;
        int[] array = new int[N];
        Random random = new Random();

        System.out.println("Heap Sort");

        for (int i = 0; i < N; i++)
            array[i] = Math.abs(random.nextInt(100));

        ArrayHeap heap = new ArrayHeap(array);
        System.out.println("The original array list is: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<=array.length;i++){
            set.add(array[i]);
        }
        System.out.println("Iterating over hashset list:");
        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        heap.HeapSort(heap);
        System.out.println("\nThe sorted list is: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");

    }


}
