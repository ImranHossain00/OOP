package polyMorphism;

// This is an example method overriding.
// Which is referred to as Runtime Polymorphism because
// the actual method that executed is determined at runtime using 'Dynamic Method Dispatch'
// based on the actual type of the object.
// Dynamic Method Dispatch is a key feature of Runtime Polymorphism.
class HumanOrgan {
    public void task() {
        System.out.println("Do something");
    }
}

class Kidney extends HumanOrgan {
    @Override
    public void task() {
        System.out.println("Purify the blood");
    }
}

class Hart extends HumanOrgan {
    @Override
    public void task() {
        System.out.println( "Flow body's blood");
    }
}

public class RuntimePolyMor {
    public static void main(String[] args) {

        // At runtime, the JVM determines the actual type of the object
        // (in this case, a Kidney object) and calls the appropriate method task().
        HumanOrgan organ = new Kidney();
        organ.task();

        // Java Compiler will detect the type of 'hart' variable/object.
        // But at runtime, the JVM determines the actual type of the object
        // (in this case, a Hart object) and calls the appropriate method.
        Hart hart = new Hart();
        hart.task();

    }
}
