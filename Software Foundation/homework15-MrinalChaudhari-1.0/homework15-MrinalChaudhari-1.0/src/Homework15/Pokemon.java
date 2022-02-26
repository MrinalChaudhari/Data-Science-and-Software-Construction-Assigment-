package Homework15;

import java.util.Objects;

//Pokemon class to declare instance of pokemon

public class Pokemon implements Comparable<Pokemon> {

   private String name;
   private int value;

    public Pokemon(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + this.getName() + '\'' +
                ", value=" + this.getValue() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return value == pokemon.value &&
                Objects.equals(name, pokemon.name);
    }

    @Override
    public int hashCode() {
        return this.getValue();

    }

    @Override
    public int compareTo(Pokemon o) {

        if(this.getValue()-o.getValue()<0){
            return -1;
        }
        else if(this.getValue()-o.getValue()>0){
            return 1;
        }
        else {
            return 0;
        }
    }
}
