package Homework09;

public class Pokemon {

    //all attributes of pokemon class
    //Pokemon is the parent class

    private String Name;
    private String Type;
    private double attack;
    private double health;

    public Pokemon(String name, String type, double attack, double health) {
        Name = name;
        Type = type;
        this.attack = attack;
        this.health = health;
    }

    public Pokemon() {

    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    //pokemon is attacked by some other pokemon and return the health of pokemon
    public void PokemonAttack(Pokemon p1) {

        setHealth(getHealth()-p1.attack);
        System.out.println();
        if(getHealth()<=0) {
            System.out.println(" Health of pokemon is 0");
        }else{
            System.out.println("Health of pokemon is:" +getHealth());
        }

        System.out.println("Pokemon loses consciousness" + PokemonHealth());
    }
    //this method will return true if pokemon is conscious otherwise it will return false
    public boolean PokemonHealth() {
        if (getHealth() <= 0)
            return true;
        else
            return false;
    }

}
