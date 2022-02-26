package Homework19;

public class Counter extends Thread {
    int num;

    public Counter(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        System.out.println(num);

    }
    public static void main(String[] args) throws InterruptedException {

        int num=Integer.parseInt(args[0]);
        if(args.length!=1){
            System.out.println("Usage: java homework.Counter <number>");
            System.exit(1);
        }
        for (int i = 1; i <= num; i++) {
            Thread thread = new Counter(i);
            thread.start();
            thread.join();
        }
    }
}
