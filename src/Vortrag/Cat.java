package Vortrag;

public class Cat extends Animal {

    private String foodPreference = "Whiskas";

    public Cat(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Vortrag.Cat{" +
                "name='" + name + '\'' +
                ", foodPreference='" + foodPreference + '\'' +
                '}';
    }

    public Cat(){
        super();

    }
}
