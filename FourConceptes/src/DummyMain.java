



public class DummyMain {
    public static void main(String[] args) {
        // Here 'new' operator is used for creating a object in the Heap of the memory.
        // SmartPhone() Constructor is used for
        // creating/initializing the states of the properties of the object.
        SmartPhone smartPhone1 = new SmartPhone();
        smartPhone1.setName("IPhone");
        smartPhone1.setProcessor(Processors.QUAD_CORE);
        smartPhone1.setoSystem(OperatingSystem.IOS);


        // Here smartphone1 and smartphone 2 are bath carrying the same reference value.
        // Or indicating same object.
        SmartPhone smartPhone2 = new SmartPhone(smartPhone1);


    }
}

class SmartPhone {
    private String name;
    private OperatingSystem oSystem;
    private Processors processor;

    private static String protocol;

    public static String getProtocol() {
        return protocol;
    }

    public static void setProtocol(String protocol) {
        SmartPhone.protocol = protocol;
    }

    // Java compiler provides a default Constructor
    // if we do not explicitly declare a Constructor.
    // The default constructor do not have any body and parameters.
    SmartPhone() {}
    SmartPhone(SmartPhone s) {
        this.name = s.getName();
        this.oSystem = s.getoSystem();
        this.processor = s.getProcessor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperatingSystem getoSystem() {
        return oSystem;
    }

    public void setoSystem(OperatingSystem oSystem) {
        this.oSystem = oSystem;
    }

    public Processors getProcessor() {
        return processor;
    }

    public void setProcessor(Processors processor) {
        this.processor = processor;
    }

    public String getDummyProtocol() {
        return protocol;
    }

//    @Override
//    public String toString() {
//        return "SmartPhone {\n" +
//                "\tname= " + name +
//                " \n\toSystem = " + oSystem +
//                " \n\tprocessor = " + processor +
//                "\n}";
//    }
}

enum Processors {
    SNAPDRAGON,
    QUAD_CORE
}

enum OperatingSystem {
    IOS,
    ANDROID
}