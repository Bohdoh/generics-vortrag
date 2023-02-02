package Vortrag;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {

        //int ist der Typ. Durch das Deklarieren wird die Variable i als Integer typisiert. In Java ist
        //die Typisierung statisch, eine Variable kann ihren Typ nicht ändern.
        int i;

        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(25);

        int number1 = al.get(0);
        int number2 = al.get(1);

        System.out.println("Summe: " + (number1+number2));

        Printer<Dog> printer = new Printer<>(new Dog("Bilbo"));
        printer.print();
        Printer<Cat> catPrinter = new Printer<>(new Cat("Mauzi"));
        catPrinter.print();

        shout("John");
        shout(25);
        shout(33.5);
    }

    //Generic Methode für alle Typen
    private static <T> void shout (T thingToShout){
        System.out.println(thingToShout + "!!!!!");
    }

    /*
    //Spezielle Methode für einzelne Typen
    private static void shout (String thingToShout){
        System.out.println(thingToShout + "!!!!!");
    }

    private static void shout (int thingToShout){
        System.out.println(thingToShout + "!!!!!");
    }

    private static void shout (Double thingToShout){
        System.out.println(thingToShout + "!!!!!");
    }
     */
}