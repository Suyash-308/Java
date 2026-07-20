package oops;

public class DemoOverLoading {
    public static void main(String[] args){
        DemoOverLoading d=new DemoOverLoading();
        System.out.println(d.add(2,3));
        System.out.println(d.add(2f,3f));
        System.out.println(d.add(2f,3f,5f));

    }
    public int add(int a,int b){
        return a+b;
    }

    public float add(float a,float b){
        return a+b;
    }

    public float add(float a,float b,float c){
        return a+b+c;
    }


}
