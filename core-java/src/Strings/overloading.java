package Strings;



class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class overloading {
    public static void main(String[] args) {
        Animal1 a = new Dog1(); // Reference type Animal, object type Dog
        a.sound();            // Calls Dog's overridden method
    }
}
