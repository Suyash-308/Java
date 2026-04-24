package practice;

public class Demo6 {
    public static void main(String[] args) {

        Student s=new Student();
        s.setName("Ravan");
        s.setId(2);
        System.out.println(s.getId());
        System.out.println(s.getName());

    }
}
class Student{
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

   public int getId(){
        return id;
   }
    public String getName(){
        return name;
    }
}