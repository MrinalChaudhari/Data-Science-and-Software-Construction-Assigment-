package Homework08;

public class TelephonTester {

    public static void main(String[] args){ //start of main class
    Telephone T1=new Telephone();

    T1.setModel("Landline");
    T1.dial(500326);
    T1.disconnect(500326);
    T1.redial();
    T1.disconnect(36532);
    T1.disconnect(5000365);
    T1.dial(50003666);
    T1.disconnect(50003666);
    T1.dial(500327);
    T1.disconnect(500327);
    T1.redial();
    T1.dialled();
    T1.Totalcall();
    T1.representation();




    }//end of main class
}//end of TelephoneTester class
