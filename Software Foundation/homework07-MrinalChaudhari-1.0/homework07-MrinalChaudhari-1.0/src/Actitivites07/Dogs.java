package Actitivites07;

public class Dogs {


        String name;
        int age;
        int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dogs(String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String args[]){

            // Dog dog1=new Dog();
            //  Dog dog2=new Dog();
            // System.out.println(dog1);
            // System.out.println(dog2);
        }


}
