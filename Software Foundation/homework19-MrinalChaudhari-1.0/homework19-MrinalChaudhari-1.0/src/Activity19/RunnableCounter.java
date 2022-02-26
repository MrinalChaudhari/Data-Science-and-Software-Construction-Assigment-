package Activity19;

public class RunnableCounter implements Runnable {

    int number;

    public RunnableCounter(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for(int i=1;i<101;i++) {

            System.out.println("Thread " + number+" "+i);
        }

    }

    public static void main(String[] args) {
        RunnableCounter runnable=new RunnableCounter(1);
        Thread thread= new Thread(runnable);
        thread.start();

        RunnableCounter runnable1=new RunnableCounter(2);
        Thread thread2= new Thread(runnable1);
        thread2.start();
    }
}
