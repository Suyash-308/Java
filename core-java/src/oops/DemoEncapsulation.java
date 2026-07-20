package oops;

public class DemoEncapsulation {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static class Main1{
        public static void main(String[] args) {
            DemoEncapsulation d=new DemoEncapsulation();
            d.setId(5);

            System.out.println(d.getId());
        }

    }
}
