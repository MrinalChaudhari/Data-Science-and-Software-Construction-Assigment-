package Activity16;

import java.util.Arrays;

public class ArrayHeap implements Heap {

    private int[] array;
    private int size;

    public ArrayHeap(){
        array=new int[8];
        size=0;
    }

    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }
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

    @Override
    public int remove() {
        int value =array[0];
        size--;
        array[0]=array[size];
        array[size]=0;
        siftDown(array,size);
        return value;

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

    public static void main(String[] args) {
        Heap heap=new ArrayHeap();
        heap.add(0);
        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(6);
        heap.add(7);
        heap.add(8);
        heap.add(9);
        System.out.println(heap);
        while(heap.size()>0) {
            System.out.println(heap.remove());
        }
    }
}
