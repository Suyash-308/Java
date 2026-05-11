class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class overloading {
    public static void main(String[] args) {
        Animal a = new Dog(); // Reference type Animal, object type Dog
        a.sound();            // Calls Dog's overridden method
    }
}
