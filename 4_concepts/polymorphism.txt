### Compile-time Polymorphism (Method Overloading):
Compile-time polymorphism is achieved through method overloading. 
Method overloading allows multiple methods with the same name but different parameters to coexist in a class.
The Java compiler determines which overloaded method to call based on the number, type, and order of the arguments provided. 
The decision on which method to invoke is made at compile-time.
Examples of method overloading include having multiple methods with different parameter types, different number of parameters, or different order of parameters.

Example:
```
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

In the above example, the Calculator class has two add methods, one that takes two int parameters and another that takes two double parameters.
The appropriate method is called based on the data types of the arguments provided.

### Runtime Polymorphism (Method Overriding):
Runtime polymorphism is achieved through method overriding.
Method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.
The subclass method must have the same name, return type, and parameters as the superclass method.
The decision on which method to invoke is made at runtime, based on the actual type of the object.

Example:
```
public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
```
In the above example, the Animal class has a sound method, and the Cat class extends Animal and overrides the sound method with its own implementation. 
When an object of the Cat class is created and the sound method is called, the overridden method in the Cat class is executed instead of the one in the Animal class.









