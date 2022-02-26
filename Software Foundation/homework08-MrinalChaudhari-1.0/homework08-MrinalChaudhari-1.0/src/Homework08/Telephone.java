package Homework08;

public class Telephone {
    /**
     * creation of telephone instances and constructor
     * getter and setter method and tostring method
     * initialization of initial value of telephone in constructor and counter to count next value
     */
    private String  model;
    private double Number;
    private double Number2;
    private int progress;
    private int call;
    private static int totalcall;
    private static int cnt;
    private double[] dialNumber=new double[10];

    public Telephone(double number) {
        Number = number;
    }
    public Telephone(){
        this.Number=5550001+getcnt();
        setcnt(1);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double number) {
        Number = number;
    }

    public double getNumber2() {
        return Number2;
    }

    public void setNumber2(double number2) {
        Number2 = number2;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }


    public int getcnt() {
        return cnt;
    }

    public void setcnt(int cnt) {
        Telephone.cnt = cnt + Telephone.cnt;
    }

    public int getTotalcall() {
        return totalcall;
    }

    public void setTotalcall(int totalcall) {
        Telephone.totalcall = Telephone.totalcall+totalcall;
    }

    /**
     *
     * @param Number3 is user defined value (from main class) which is compared with initialized value. If it is equal then it will print "Error"
     */
    public void dial(double Number3){
        if(getNumber()==Number3){
            System.out.println("Error");
        }else if(getProgress()==1){
            System.out.println("Error");
        }else if(getProgress()==0){
            System.out.println("Dial number: calling " +Number3);
            setProgress(1);
            setCall(1);
            setTotalcall(1);
            setNumber2(Number3);
            for(int i=0;i<=10;i++){
                if(dialNumber[i]==0){
                    dialNumber[i]=Number3;
                    break;
                }
            }
        }
    }
    public void Totalcall(){
        System.out.println("Total calls: " +getTotalcall());
    }
    public void disconnect(double Number3){
        if(getProgress()==0){
            System.out.println("Disconnect!! call is not in progress");
        }
        else if(getProgress()==1 && Number3==getNumber2()){
            System.out.println("Disconnect");
            System.out.println("Call is ending with "+Number3+ "Number");
            setProgress(0);
        }
        else if(getProgress()==1 && Number3!=getNumber2()){
            System.out.println("Disconnect!! call is not in progress");
        }
    }
    public void redial(){
        if(getCall()==0){
            System.out.println("No records found");
        }else if(getCall()==1){
            dial(getNumber2());
        }
    }
    public void dialled(){
        System.out.println("Dialled Numbers are:");
        for(int j=9;j>=0;j--){
            if(dialNumber[j]!=0){
                System.out.println(dialNumber[j]);
            }
        }
    }
    public void representation(){
        System.out.println("**Telephone Description**");
        System.out.println("Number : " +getNumber());
        System.out.println("Model : " +getModel());
        if(getCall()==0){
            System.out.println("No calls dialled");
        }else if(getCall()==1){
            System.out.println("Last call dialled: " +Number2);
        }
    }

}