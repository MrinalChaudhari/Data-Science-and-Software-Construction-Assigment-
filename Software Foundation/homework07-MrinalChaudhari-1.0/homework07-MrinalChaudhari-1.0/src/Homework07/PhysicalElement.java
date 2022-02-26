/*Define a class representing physical elements (like hydrogen, helium, lithium, etc.). Elements have a name, a symbol, an integer atomic number, and an atomic weight
* Your class should have a constructor that sets all the properties, and a toString method that prints each element as a nicely formatted String.
* Write accessors and mutators for each field*/

package Homework07;

public class PhysicalElement {
    private String name;
    private String symbol;
    int atomicNo;
    double atomicWt;

    public PhysicalElement(String name, String symbol,int atomicNo, double atomicWt) {
        this.name=name;
        this.symbol=symbol;
        this.atomicNo=atomicNo;
        this.atomicWt=atomicWt;
    }

    @Override
    public String toString() {
        return "PhysicalElement{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNo=" + atomicNo +
                ", atomicWt=" + atomicWt +
                '}';
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomicNo() {
        return atomicNo;
    }

    public void setAtomicNo(int atomicNo) {
        this.atomicNo = atomicNo;
    }

    public double getAtomicWt() {
        return atomicWt;
    }

    public void setAtomicWt(double atomicWt) {
        this.atomicWt = atomicWt;
    }

    /**
     *
     * @param args In main class element1 is a object created for class
     * PhysicalElement() is a constructor of class which is parameterized takes value of attributes.
     */
    public static void main(String[] args)
    {
        PhysicalElement element1=new PhysicalElement("hydrogen","H",1, 84);
        System.out.println(element1);
        PhysicalElement element2=new PhysicalElement("lithium","Li",3, 6.938);
        System.out.println(element2);
        PhysicalElement element3=new PhysicalElement("Boron","B",5, 10.806);
        System.out.println(element3);
        PhysicalElement element4=new PhysicalElement("carbon","C",6, 12.0096);
        System.out.println(element4);
        PhysicalElement element5=new PhysicalElement("Nitrogen","N",7, 14.006);
        System.out.println(element5);
        PhysicalElement element6=new PhysicalElement("Oxygen","O",8, 15.999);
        System.out.println(element6);
        PhysicalElement element7=new PhysicalElement("magnesium","Mg",12, 24.304);
        System.out.println(element7);
        PhysicalElement element8=new PhysicalElement("silicon","Si",14, 28.084);
        System.out.println(element8);
        PhysicalElement element9=new PhysicalElement("sulfur","S",16, 32.059);
        System.out.println(element9);
        PhysicalElement element10=new PhysicalElement("chlorine","Cl",17, 35.446);
        System.out.println(element10);

    }
}
