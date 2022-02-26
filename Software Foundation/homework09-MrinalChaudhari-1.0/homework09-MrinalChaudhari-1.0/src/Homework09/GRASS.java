package Homework09;
//grass class is derived from pokemon class

public class GRASS extends Pokemon{
    public GRASS(String name, String type, double attack, double health) {
        super(name, type, attack, health);

        if(type=="FIRE"){

            attack=1/2 * attack;
            System.out.println("Attack is"+attack);
        }
        else if(type=="GRASS"){

            System.out.println("Attack is:"+attack);
        }
        else if(type=="WATER"){

            attack=2*attack;
            System.out.println("Attack is:"+attack);
        }
        else {
            System.out.println("Attack is:" +attack);
        }
    }
    public GRASS() {
        super();
    }
}
