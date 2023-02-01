package Vortrag;

// Generic Printer für alle Typen
public class Printer<T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
/*
----------------------------------------------------
//Bounded Generic Printer nur für Animals
public class Printer<T extends Animal> {
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        //thingToPrint ist ein Animal, daher können wir über thingToPrint auf Methoden von Animal zugreifen
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
----------------------------------------------------
Printer speziell nur für Integer

public class IntegerPrinter {
    Integer thingToPrint;

    public Printer(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}*/

