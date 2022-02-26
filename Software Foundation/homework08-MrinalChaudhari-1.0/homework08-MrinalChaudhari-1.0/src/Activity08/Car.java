package Activity08;

public class Car {
    
    private String Make ;
    private String Model;
    private int Year;
    private String Colour;
    private int VIN;
    private static int CAR_COUNT=0;

    public Car(String make, String model, int year, String colour, int VIN) {
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Colour = colour;
        this.VIN = VIN;

    }
    public Car(int CAR_COUNT){
        this.CAR_COUNT= CAR_COUNT;

    }
    public static int getCarCount() {
        return CAR_COUNT;
    }

    public static void setCarCount(int carCount) {
        CAR_COUNT =carCount;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", Colour='" + Colour + '\'' +
                ", VIN=" + VIN +
                '}';
    }

    public static void main(String[] args){

        Car C1=new Car("Dogde", "Dart", 2013, "Red", 1235645);
        Car cnt=new Car(1);
        setCarCount(2);
        System.out.println(C1);
        Car C2=new Car("Dogde", "Dart", 2013, "Red", 1235645);
        System.out.println(C1.equals(C2));
        System.out.println(getCarCount());

    }

}
