package practice;

public class Demo4 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.add();
        dog.m1();
    }
}
interface  D{
    void add();
}

interface Animal{
    void m1();
}

class Dog implements Animal ,D{

    @Override
    public void m1() {
        System.out.println("Method m-1");
    }

    @Override
    public void add() {
        System.out.println("Aad method");
    }
}
