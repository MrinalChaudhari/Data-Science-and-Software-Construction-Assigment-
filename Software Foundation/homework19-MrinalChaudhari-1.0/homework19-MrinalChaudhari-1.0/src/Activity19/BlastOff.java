package Activity19;

public class BlastOff extends Thread {


    int number;

    public BlastOff(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int time=-10;

        while(true) {
            if(time<0) {
                System.out.println("T=" +time);

            }
            time++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlastOff blast=new BlastOff(1);
        blast.start();
        Thread.sleep(7000);
        blast.interrupt();

    }
}
