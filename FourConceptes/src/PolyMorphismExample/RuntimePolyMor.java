package PolyMorphismExample;

// This is an example method overriding.
// Which is an example of Runtime Polymorphism.
class HumanOrgan {
    public String task() {
        return "Do something";
    }
}

class Kidney extends HumanOrgan {
    @Override
    public String task() {
        return "Purify the blood";
    }
}

class hart extends HumanOrgan {
    @Override
    public String task() {
        return "Flow body's blood";
    }
}

public class RuntimePolyMor {

}
