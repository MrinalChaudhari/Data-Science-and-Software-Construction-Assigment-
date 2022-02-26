package Activity19;

public class ManyCounter  {
            public static void main(String[] args) throws InterruptedException {

                Thread[] threads = new Thread[10];
                for (int i=0;i<10;i++){
                    RunnableCounter counter= new RunnableCounter(i);
                    Thread thread=new Thread(counter);
                    thread.start();
                    threads[i]=thread;
                }
        for (Thread thread:threads){
            thread.join();
            System.out.println("All done!");
        }
    }
}
