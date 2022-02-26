/*The class must provide a parameterless constructor that initializes the temperature of the thermometer to 37o.You class should provide methods to get and set the temperature using Celsius, Fahrenheit, or Kelvin
* In your main method, create a thermometer and print it at several different temperatures.*/

package Homework07;

public class Thermometer {
    private double celsius;
    private double kelvin;
    private double fahrenheit;

    public Thermometer() {
        this.celsius = 37;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void Celsius(){
        double c = getCelsius();
        setCelsius(c);
    }

    public void Kelvin(){
        double c = getCelsius();
        double k = c+273.15;
        setKelvin(k);
    }

    public void Fahrenheit(){
        double c = getCelsius();
        double k = (c*9/5)+32;
        setFahrenheit(k);
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "celsius=" + celsius +
                ", kelvin=" + kelvin +
                ", fahrenheit=" + fahrenheit +
                '}';
    }

    /**
     *
     * @param args
     * In main method, it creates object of new thermometer and used to set initial celsius value.
     * and then it is used to call different methods to prin temperature in kelvin, and fahrenheit.
     */

    public static void main(String[] args) {

        Thermometer temp=new Thermometer();
        System.out.println("Initial celsius temperature: -50");
        temp.setCelsius(-50);
        temp.Fahrenheit();
        temp.Kelvin();
        System.out.println(temp);
        System.out.println();

        System.out.println("Initial celsius temperature: 0");
        temp.setCelsius(0);
        temp.Fahrenheit();
        temp.Kelvin();
        System.out.println(temp);
        System.out.println();


        System.out.println("Initial celsius temperature: 100");
        temp.setCelsius(100);
        temp.Fahrenheit();
        temp.Kelvin();
        System.out.println(temp);
        System.out.println();
    }
}
