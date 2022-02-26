package Activity19;

public class CounterThread extends Thread{

    int num;

    public CounterThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        for(int i=1;i<101;i++) {

            System.out.println("Thread " + num+" "+i);
        }
    }

    public static void main(String[] args) {


        CounterThread counterthread=new CounterThread(1);
        System.out.println(counterthread.isAlive());
        counterthread.start();
        System.out.println(counterthread.isAlive());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counterthread.isAlive());

    }
}
