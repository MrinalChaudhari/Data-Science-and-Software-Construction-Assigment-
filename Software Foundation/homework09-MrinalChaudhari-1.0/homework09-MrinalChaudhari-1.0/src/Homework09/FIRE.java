package Homework09;

//Fire class is derived from pokemon class
public class FIRE extends Pokemon{
    public FIRE(String name, String type, double attack, double health) {
        super(name, type, attack, health);

        if(type=="FIRE"){
            System.out.println("Attack is"+attack);
        }
        else if(type=="GRASS"){

            attack=2*attack;
            System.out.println("Attack is:"+attack);
        }
        else if(type=="WATER"){
            attack=1/2 * attack;
            System.out.println("Attack is:"+attack);
        }
        else {
            System.out.println("Attack is:" +attack);
        }
    }
    public FIRE() {

    }
}
