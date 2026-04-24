package practice;

public class Demo5 {
    public static void main(String[] args) {
        Company c=new Employee();
        c.add();

    }
}
class Company{
    void add(){
        System.out.println("parent class");
    }
}
class Employee extends Company{
    @Override
    void add() {
        System.out.println("child class");
    }
}
