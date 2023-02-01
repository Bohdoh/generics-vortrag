package Vortrag;

public class Dog extends Animal{
    int walkDistancePreferenceInKm = 10;

    public Dog(String name){
        super(name);
    }
    public Dog(){

    }

    @Override
    public String toString() {
        return "Vortrag.Dog{" +"name='" + name + '\'' +
                ", walkDistancePreferenceInKm=" + walkDistancePreferenceInKm +
                '}';
    }
}
