package Actitivites07;

public class Wizard {

        String name;
        int age;

        Wizard(String name,int age){
            this.name=name;
            this.age=age;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
            Wizard Wiz1=new Wizard("ABC",18);
            System.out.println(Wiz1);

            //Wiz.name="ABC";
            //Wiz.age=9;
            //System.out.println(Wiz);
        }
}
