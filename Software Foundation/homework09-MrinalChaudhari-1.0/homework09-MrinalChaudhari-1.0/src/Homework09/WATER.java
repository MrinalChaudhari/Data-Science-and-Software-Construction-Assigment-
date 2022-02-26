package Homework09;

//Water class is derived from pokemon class

public class WATER extends Pokemon {
    public WATER(String name, String type, double attack, double health) {
        super(name, type, attack, health);

        if (type == "FIRE") {
            attack = 2 * attack;
            System.out.println("Attack is" + attack);
        } else if (type == "GRASS") {
            attack = 1 / 2 * attack;
            System.out.println("Attack is:" + attack);
        } else if (type == "WATER") {

            System.out.println("Attack is:" + attack);
        } else {
            System.out.println("Attack is:" + attack);
        }

    }
    public WATER() {

    }
}