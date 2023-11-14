package AbstructionExample;

// This is an example of Abstraction
// The concept of Abstraction is that hiding the details code or non-important implementation
// which is not necessary for the user and
// only expose the variables or methods that are necessary for the user.
// Here HumanOrgans class is an abstract class.
// Which have an abstract method.
// It can have abstract and non-abstract methods.
// It can't be instantiated.
// It can have static methods and final methods.

abstract class HumanOrgans {
    HumanOrgans() {
        System.out.print("Your are selecting an organ which is: ");
    }
    final public void eat() {
        System.out.println("For being live Animal have to eat");
    }
    abstract public void task();

}

// Kidney class don't need to know the implementation of the Constructor of the super class HumanOrgans.
// So in this case abstraction concept is used.
// Constructor chaining is applied from HumanOrgans class constructor.
class Kidney extends HumanOrgans {
    Kidney() {
        System.out.println("Kidney");
    }
    @Override
    public void task() {
        System.out.println("Purifies the blood");
    }
}

class Hart extends HumanOrgans {

    Hart() {
        System.out.println("Hart");
    }
    @Override
    public void task() {
        System.out.println("Flows the blood");
    }
}

// ===============================================================================
// The concept of pure abstraction is used/implemented by the interface.
// All fields in interfaces are public, static and final by default.
// Here eat is by default public, static and final
// Interfaces support the functionality of multiple inheritance.
interface Animal {
    boolean eat = true;
    void walk();
}

interface GentaleAnimal {
    void task();
}

// Multiple inheritance.
class Horse implements Animal, GentaleAnimal {
    @Override
    public void walk() {
        System.out.println("Horse have 4 legs and uses to walk");
    }

    @Override
    public void task() {
        System.out.println("don't disturb to other");
    }
}
public class Example {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        Hart hart = new Hart();

        Horse horse = new Horse();
        boolean eat = Animal.eat; // eat is static, final and public field.
    }
}
