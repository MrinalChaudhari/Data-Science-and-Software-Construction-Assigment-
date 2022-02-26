package Homework09;

//Arena class is derived from pokemon class
//Two pokemon battle with each other

public class Arena extends Pokemon{

    private void method(Pokemon p1, Pokemon p2){

        do{
            System.out.println(p1+ "battle starts with " +p2);
            p1.PokemonAttack(p2);
            System.out.println("Damage of pokemon:" +getAttack());
            System.out.println("Health of Pokemon is:"+getHealth());
            System.out.println(p2+ "battle starts with " +p1);
            p2.PokemonAttack(p1);
            System.out.println("Damage of pokemon:" +getAttack());
            System.out.println("Health of Pokemon is:"+getHealth());

        }while((p1.getHealth() >= 1) && (p2.getHealth() >= 1));
        if(p1.getHealth()<1){
            System.out.println(p1+ "Has lost the fight");
        }
        else {
            System.out.println(p2+ "has lost the fight");
        }

    }
}
